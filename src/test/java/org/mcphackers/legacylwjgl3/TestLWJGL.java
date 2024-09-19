package org.mcphackers.legacylwjgl3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class TestLWJGL {

    private MethodNode getMethod(ClassNode node, String name, String desc) {
        for(MethodNode m : node.methods) {
            if(m.name.equals(name) && m.desc.equals(desc)) {
                return m;
            }
        }
        return null;
    }
    
    @Test
    public void test() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/list.txt")));
        ClassNode savedNode = null;
        String oldClassName = null;
        String s;
        while((s = reader.readLine()) != null) {
            if(s.startsWith("#")) {
                continue;
            }
            if(!s.contains(".") || !s.contains("(")) {
                continue;
            }
            int dot = s.indexOf('.');
            int bracket = s.indexOf('(');
            String className = s.substring(0, dot);
            String methodName = s.substring(dot+1, bracket);
            String methodDesc = s.substring(bracket);
            if(!className.equals(oldClassName)) {
                savedNode = new ClassNode();
                ClassReader classReader = new ClassReader(className);
                classReader.accept(savedNode, 0);
            }
            MethodNode m = getMethod(savedNode, methodName, methodDesc);
            if(m == null) {
                System.out.println(className + "." + methodName + methodDesc);
            }
            // assertTrue(m != null);
            oldClassName = className;
        }
    }
}

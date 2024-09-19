package org.mcphackers.legacylwjgl3;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class MergeLWJGL extends DefaultTask {

    Set<File> sourceSet;
    Set<File> classpath;
    File outputPreMerge;

    @TaskAction
    void execute() throws IOException {

        for(File file : sourceSet) {
            Path dir = file.toPath();
            try (Stream<Path> paths = Files.walk(dir)) {
                paths.filter(Files::isRegularFile).collect(Collectors.toList()).forEach(p -> {
                    String pkg = "org/mcphackers/legacylwjgl3/lwjgl/";
                    if (!dir.relativize(p).toString().startsWith(pkg) || !p.getFileName().toString().endsWith(".class")) {
                        return;
                    }
                    String className = "org/lwjgl/" + dir.resolve(pkg).relativize(p).normalize().toString();
                    try {
                        for(File file2 : classpath) {
                            try (ZipFile zip = new ZipFile(file2)) {
                                ZipEntry entry = zip.getEntry(className);
                                
                                if (entry != null && !entry.isDirectory()) {
                                    ClassNode nodeLWJGL = new ClassNode();
                                    try (InputStream inputStream = zip.getInputStream(entry)) {
                                        ClassReader reader = new ClassReader(inputStream);
                                        reader.accept(nodeLWJGL, 0);
                                    }
                                    ClassReader reader = new ClassReader(Files.newInputStream(p));
                                    ClassNode node = new ClassNode();
                                    reader.accept(node, 0);
                                    for(MethodNode m : node.methods) {
                                        if(!m.name.equals("<init>") && !m.name.equals("<clinit>")) {
                                            MethodNode existingMethod = getMethod(nodeLWJGL, m.name, m.desc);
                                            if(existingMethod != null) {
                                                System.out.println("Replacing " + nodeLWJGL.name + "." + m.name + m.desc);
                                                nodeLWJGL.methods.remove(existingMethod);
                                            }
                                            nodeLWJGL.methods.add(m);
                                        }
                                    }
                                    for(FieldNode f : node.fields) {
                                        FieldNode existingField = getField(nodeLWJGL, f.name, f.desc);
                                        if(existingField != null) {
                                            System.out.println("Replacing " + nodeLWJGL.name + "." + f.name);
                                            nodeLWJGL.fields.remove(existingField);
                                        }
                                        nodeLWJGL.fields.add(f);
                                    }
                                    ClassWriter writer = new ClassWriter(0);
                                    nodeLWJGL.accept(writer);
                                    Path p2 = dir.resolve(className);
                                    Files.write(p2, writer.toByteArray());
                                    Files.delete(p);
                                    break;
                                }
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }
                });
            }
        }
    }

    private static MethodNode getMethod(ClassNode node, String name, String desc) {
        for(MethodNode m : node.methods) {
            if(m.name.equals(name) && m.desc.equals(desc)) {
                return m;
            }
        }
        return null;
    }

    private static FieldNode getField(ClassNode node, String name, String desc) {
        for(FieldNode f : node.fields) {
            if(f.name.equals(name) && f.desc.equals(desc)) {
                return f;
            }
        }
        return null;
    }
}
# legacy-lwjgl3

A hacky over-engineered project that creates a bridge between legacy LWJGL2 API and LWJGL3
Allowing you to use modern LWJGL features and libraries on older Minecraft versions.

## Credits
A whole lot of this code is just code from the original LWJGL 2 project modified to work with LWJGL 3, Thanks so much to
the LWJGL devs for making their license so permissive.

and a big thanks to gudenau for the original F*rge mod <https://github.com/gudenau/MC-LWJGL3> that did the same thing,
thanks as a big portion of this code is from that project.
 
# Performance Increases?
While increasing performance was not the main point you do very much do see a benefit from LWJGl 3's quite substantial performance increase,
resulting in a bump of about 20 fps (for me) even while having to emulate a lot of lwjgl 2 code that got removed.

![results](.github/results.png) <br>
The settings used
```yaml
JDK: temurin-17 (Adopt OpenJDK Hotspot 17)
JVM Options:
  -client
  -server
mods:
  - fabricloader 0.13.3,
  - java 17,
  - minecraft 1.8.9
World seed: 123
Options changed from default:
  - Map FPS: unlimited
  - Use VBOS: true
  - VSync: Disabled
```
NCAU Java 10, 11, 12
==========================

# Companion code for the NCAU "Java 10, 11, 12".

 * the `newwithi101112` module contains code that demonstrates new APIs with Java 10, 11 & 12
   * `src/main/sh` contains demos for the single source file launch and the shebang launch
   * `NativeClass.java` and `newwith10-11-12/pom.xml` show how to generate JNI header files with javac

# Further Readings

### JEPs of Java 10 
286: [Local-Variable Type Inference](https://openjdk.java.net/jeps/286)  
296: [Consolidate the JDK Forest into a Single Repository](https://openjdk.java.net/jeps/296)  
304: [Garbage-Collector Interface](https://openjdk.java.net/jeps/304)  
307: [Parallel Full GC for G1](https://openjdk.java.net/jeps/307)  
310: [Application Class-Data Sharing](https://openjdk.java.net/jeps/310)  
312: [Thread-Local Handshakes](https://openjdk.java.net/jeps/312)  
313: [Remove the Native-Header Generation Tool (javah)](https://openjdk.java.net/jeps/313)  
314: [Additional Unicode Language-Tag Extensions](https://openjdk.java.net/jeps/314)  
316: [Heap Allocation on Alternative Memory Devices](https://openjdk.java.net/jeps/316)  
317: [Experimental Java-Based JIT Compiler](https://openjdk.java.net/jeps/317)  
319: [Root Certificates](https://openjdk.java.net/jeps/319)  
322: [Time-Based Release Versioning](https://openjdk.java.net/jeps/322)

### JEPs of Java 11
181: [Nest-Based Access Control](https://openjdk.java.net/jeps/181)  
309: [Dynamic Class-File Constants](https://openjdk.java.net/jeps/309)  
315: [Improve Aarch64 Intrinsics](https://openjdk.java.net/jeps/315)  
318: [Epsilon: A No-Op Garbage Collector](https://openjdk.java.net/jeps/318)  
320: [Remove the Java EE and CORBA Modules](https://openjdk.java.net/jeps/320)  
321: [HTTP Client (Standard)](https://openjdk.java.net/jeps/321)  
323: [Local-Variable Syntax for Lambda Parameters](https://openjdk.java.net/jeps/323)  
324: [Key Agreement with Curve25519 and Curve448](https://openjdk.java.net/jeps/324)  
327: [Unicode 10](https://openjdk.java.net/jeps/327)  
328: [Flight Recorder](https://openjdk.java.net/jeps/328)  
329: [ChaCha20 and Poly1305 Cryptographic Algorithms](https://openjdk.java.net/jeps/329)  
330: [Launch Single-File Source-Code Programs](https://openjdk.java.net/jeps/330)  
331: [Low-Overhead Heap Profiling](https://openjdk.java.net/jeps/331)  
332: [Transport Layer Security (TLS) 1.3](https://openjdk.java.net/jeps/332)  
333: [ZGC: A Scalable Low-Latency Garbage Collector (Experimental)](https://openjdk.java.net/jeps/333)  
335: [Deprecate the Nashorn JavaScript Engine](https://openjdk.java.net/jeps/335)  
336: [Deprecate the Pack200 Tools and API](https://openjdk.java.net/jeps/336)

### JEPs of Java 12
189: [Shenandoah: A Low-Pause-Time Garbage Collector (Experimental)](https://openjdk.java.net/jeps/189)  
230: [Microbenchmark Suite](https://openjdk.java.net/jeps/230)  
325: [Switch Expressions (Preview)](https://openjdk.java.net/jeps/325)  
334: [JVM Constants API](https://openjdk.java.net/jeps/334)  
340: [One AArch64 Port, Not Two](https://openjdk.java.net/jeps/340)  
341: [Default CDS Archives](https://openjdk.java.net/jeps/341)  
344: [Abortable Mixed Collections for G1](https://openjdk.java.net/jeps/344)  
346: [Promptly Return Unused Committed Memory from G1](https://openjdk.java.net/jeps/346)

### Removed 
#### Alternative CORBA implementations
[GlassFish-Corba](https://javaee.github.io/glassfish-corba/)  
[JacORB](https://www.jacorb.org/)

#### Alternative application packagers
[jlink](https://docs.oracle.com/javase/10/tools/jlink.html)  
[JEP 343](https://openjdk.java.net/jeps/343)

### Nashorn alternatives
<<<<<<< HEAD
[Rhino](https://developer.mozilla.org/de/docs/Rhino)  
[J2V8](https://github.com/eclipsesource/J2V8)  
[Migration guide from Nashorn to GraalVM JavaScript](https://github.com/graalvm/graaljs/blob/master/docs/user/NashornMigrationGuide.md)  
[Oracle GraalVM announces support for Nashorn migration](https://medium.com/graalvm/oracle-graalvm-announces-support-for-nashorn-migration-c04810d75c1f)  
=======

- [Rhino](https://developer.mozilla.org/de/docs/Rhino)  
- [Migration guide from Nashorn to GraalVM JavaScript](https://github.com/graalvm/graaljs/blob/master/docs/user/NashornMigrationGuide.md)  
- [Oracle GraalVM announces support for Nashorn migration](https://medium.com/graalvm/oracle-graalvm-announces-support-for-nashorn-migration-c04810d75c1f)  
>>>>>>> c59c44c517c0be39fed86fcbf0f5e7c952a259f8

### JFR Demos
[JFR Demo](https://github.com/marschall/jfr-demo) 
[JFR Maven Extension](https://github.com/marschall/jfr-maven-extension) 
[JUnit JFR](https://github.com/marschall/junit-jfr) 
[Hibernate JFR](https://github.com/marschall/hibernate-jfr) 
[JFR JdbcTemplate](https://github.com/marschall/jfr-jdbctemplate) 
[JFR JDBC](https://github.com/marschall/jfr-jdbc)

### Misc
<<<<<<< HEAD
[Zulu Mission Control](https://www.azul.com/products/zulu-mission-control/)  
[Java Mission Control](https://jdk.java.net/jmc/)  
[Java Almanac](https://github.com/marchof/java-almanac/)
=======

- [Java Almanac](https://github.com/marchof/java-almanac/)
- [JDK 12 Security Enhancements](https://seanjmullan.org/blog/2019/03/19/jdk12)

### Application Class Data Sharing

- [Class Data Sharing, Sharing Economy in the HotSpot VM](https://archive.fosdem.org/2018/schedule/event/class_data_sharing/)
- [cl4cds](https://simonis.github.io/cl4cds/)
- [Reducing WildFly Startup Time and Footprint with AppCDS](https://marschall.github.io/2018/02/18/wildfly-appcds.html)

### Mission Control

- [Java Mission Control 6.0 Tutorial](http://hirt.se/downloads/oracle/JMC6Tutorial/JMC6Tutorial.pdf)

### -XX:+AggressiveOpts

- [What flags are enabled by -XX:+AggressiveOpts on Sun JRE 1.6u20?](https://stackoverflow.com/questions/2959878/what-flags-are-enabled-by-xxaggressiveopts-on-sun-jre-1-6u20)
- [Java’s -XX:+AggressiveOpts: Can it slow you down?](https://www.opsian.com/blog/aggressive-opts/)
>>>>>>> c59c44c517c0be39fed86fcbf0f5e7c952a259f8


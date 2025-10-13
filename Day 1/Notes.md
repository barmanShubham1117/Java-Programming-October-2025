# Day 1 - Introduction to Java

## What is Java?
- Object-oriented programming language
- Platform independent (Write Once, Run Anywhere)
- Developed by Sun Microsystems (now Oracle)
- Released in 1995

## Key Features
- **Platform Independent**: Bytecode runs on JVM
- **Object-Oriented**: Everything is an object
- **Secure**: No pointers, automatic memory management
- **Robust**: Strong memory management, exception handling
- **Multithreaded**: Concurrent programming support

## Java Environment

### JDK (Java Development Kit)
- Complete development environment
- Includes JRE + development tools

### JRE (Java Runtime Environment)
- Runtime environment for Java applications
- Includes JVM + libraries

### JVM (Java Virtual Machine)
- Executes Java bytecode
- Platform-specific implementation

## Installation & Setup
1. Download JDK from Oracle website
2. Install JDK
3. Set JAVA_HOME environment variable
4. Add Java bin directory to PATH
5. Verify: `java -version` and `javac -version`

## Java Program Structure
```java
// Comments start with //
public class ClassName {
    public static void main(String[] args) {
        // Program logic here
    }
}
```

## Basic Rules
- File name must match class name
- Case sensitive language
- Statements end with semicolon (;)
- Blocks defined by curly braces { }

## Development Process
1. Write source code (.java file)
2. Compile with javac (creates .class file)
3. Run with java command
4. JVM executes bytecode
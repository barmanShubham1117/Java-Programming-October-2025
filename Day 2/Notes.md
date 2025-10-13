# Day 2 - Java Fundamentals

## Hello World Program

### Basic Structure
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Key Components
- `public class`: Access modifier and class declaration
- `main method`: Entry point of Java program
- `String[] args`: Command line arguments
- `System.out.println()`: Output to console

### Compilation & Execution
```bash
javac HelloWorld.java  // Compiles to HelloWorld.class
java HelloWorld        // Runs the program
```

### Program Flow
1. JVM loads the class
2. Finds main method
3. Executes statements sequentially
4. Program terminates

---

# Java Data Types

## Primitive Data Types

### Integer Types
- `byte`: 8-bit, range -128 to 127
- `short`: 16-bit, range -32,768 to 32,767
- `int`: 32-bit, range -2³¹ to 2³¹-1
- `long`: 64-bit, range -2⁶³ to 2⁶³-1

### Floating Point
- `float`: 32-bit, single precision
- `double`: 64-bit, double precision

### Other Primitives
- `char`: 16-bit Unicode character
- `boolean`: true or false

## Non-Primitive Data Types

### Reference Types
- `String`: sequence of characters
- `Arrays`: collection of elements
- `Classes`: user-defined types
- `Interfaces`: contracts for classes

## Examples
```java
int age = 25;
double price = 99.99;
char grade = 'A';
boolean isActive = true;
String name = "John";
int[] numbers = {1, 2, 3};
```

## Key Points
- Primitives store values directly
- Reference types store memory addresses
- Default values: 0 for numbers, false for boolean, null for references
# Day 4 - Java Operators

## Arithmetic Operators
```java
int a = 10, b = 3;
+ // Addition: a + b = 13
- // Subtraction: a - b = 7
* // Multiplication: a * b = 30
/ // Division: a / b = 3
% // Modulus: a % b = 1
```

## Assignment Operators
```java
int x = 5;
x += 3;  // x = x + 3 = 8
x -= 2;  // x = x - 2 = 6
x *= 4;  // x = x * 4 = 24
x /= 3;  // x = x / 3 = 8
x %= 5;  // x = x % 5 = 3
```

## Comparison Operators
```java
int a = 5, b = 10;
a == b   // Equal to: false
a != b   // Not equal: true
a > b    // Greater than: false
a < b    // Less than: true
a >= b   // Greater or equal: false
a <= b   // Less or equal: true
```

## Logical Operators
```java
boolean x = true, y = false;
x && y   // AND: false
x || y   // OR: true
!x       // NOT: false
```

## Unary Operators
```java
int a = 5;
++a;     // Pre-increment: a = 6
a++;     // Post-increment: a = 7
--a;     // Pre-decrement: a = 6
a--;     // Post-decrement: a = 5
+a;      // Unary plus
-a;      // Unary minus
```

## Bitwise Operators
```java
int a = 5, b = 3;  // 5 = 101, 3 = 011
a & b    // AND: 1 (001)
a | b    // OR: 7 (111)
a ^ b    // XOR: 6 (110)
~a       // NOT: -6
a << 1   // Left shift: 10
a >> 1   // Right shift: 2
```

## Ternary Operator
```java
int max = (a > b) ? a : b;  // Conditional assignment
String result = (score >= 60) ? "Pass" : "Fail";
```

## Operator Precedence (High to Low)
1. Unary: ++, --, +, -, !
2. Multiplicative: *, /, %
3. Additive: +, -
4. Relational: <, >, <=, >=
5. Equality: ==, !=
6. Logical AND: &&
7. Logical OR: ||
8. Ternary: ?:
9. Assignment: =, +=, -=
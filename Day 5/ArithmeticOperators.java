import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // Creating an object of scanner class to take input from the user.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);
    }
}

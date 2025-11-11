public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        
        // Using for loop - multiply 1*2*3*4*5
        int factorialFor = 1;
        for (int i = 1; i <= n; i++) {
            factorialFor *= i;
        }
        System.out.println("Factorial using for loop: " + factorialFor);
        
        // Using while loop - same logic, different syntax
        int factorialWhile = 1;
        int i = 1;
        while (i <= n) {
            factorialWhile *= i;
            i++; // Increment counter
        }
        System.out.println("Factorial using while loop: " + factorialWhile);
    }
}
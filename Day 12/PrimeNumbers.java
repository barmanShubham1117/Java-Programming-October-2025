public class PrimeNumbers {
    public static void main(String[] args) {
        // Check each number from 2 to 50
        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            // Check divisibility up to square root of i
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // Not prime, exit inner loop
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
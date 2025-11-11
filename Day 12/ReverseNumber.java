public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;
        
        // Extract digits from right to left
        while (number != 0) {
            reversed = reversed * 10 + number % 10; // Add last digit
            number /= 10; // Remove last digit
        }
        
        System.out.println("Reversed number: " + reversed);
    }
}
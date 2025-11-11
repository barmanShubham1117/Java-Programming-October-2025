public class RightTriangle {
    public static void main(String[] args) {
        // Outer loop controls rows (1 to 5)
        for (int i = 1; i <= 5; i++) {
            // Inner loop prints stars equal to row number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }
    }
}
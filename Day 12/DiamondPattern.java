public class DiamondPattern {
    public static void main(String[] args) {
        // Upper half - rows 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // Print numbers 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        // Lower half - rows 4 to 1 (mirror of upper)
        for (int i = 4; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // Print numbers 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
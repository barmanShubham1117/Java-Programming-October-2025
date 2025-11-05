public class LogicalOperators {
    public static void main(String[] args) {
        
        // Sun rises from the east AND it is very hot. -> TRUE
        // Sun rises from the west AND it is very hot. -> FALSE
        // Sun rises from the east AND it is very cold. -> FALSE
        // Sun rises from the west AND it is very cold. -> FALSE

        int a = 10;
        int b = 20;
        // Logical AND (&&)
        System.out.println("Logical AND (&&) Operator:");
        System.out.println("(a > b) && (a < b): " + ((a > b) && (a < b)));
        System.out.println("(a < b) && (a < 30): " + ((a < b) && (a < 30)));
        System.out.println("(a > b) && (a > 5): " + ((a > b) && (a > 5)));
        System.out.println("(a < b) && (a > 5): " + ((a < b) && (a > 5)));
        System.out.println();

        System.out.println("Logical OR (||) Operator:");
        System.out.println("(a > b) || (a < b): " + ((a > b) || (a < b)));
        System.out.println("(a < b) || (a < 30): " + ((a < b) || (a < 30)));
        System.out.println("(a > b) || (a > 5): " + ((a > b) || (a > 5)));
        System.out.println("(a < b) || (a > 5): " + ((a < b) || (a > 5)));
        System.out.println();

        System.out.println("Logical NOT (!) Operator:");
        System.out.println("!(a > b): " + (!(a > b)));
        System.out.println("!(a < b): " + (!(a < b)));
    }
}

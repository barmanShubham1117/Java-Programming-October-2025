import java.util.Scanner;

public class User_Age_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age entered.");
        } else if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }
}

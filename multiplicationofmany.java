import java.util.Scanner;

public class multiplicationofmany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter a number to print its multiplication table: ");
            int number = scanner.nextInt();

            // Print the multiplication table
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            // Ask if the user wants to continue
            System.out.println("Do you want to print the multiplication table of another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

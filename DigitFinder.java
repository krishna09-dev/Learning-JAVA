
import java.util.Scanner;

public class DigitFinder {
    public static void main(String[] args) {
    
        // Write a program to find the last digit of a number.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int digit;
        digit = number % 10;
        System.out.println(digit);
        sc.close();


    }
}

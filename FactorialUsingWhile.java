import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int factorial = 1;
        while (i<=n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of "+n+" is "+factorial);
        sc.close();
    }
}

import java.util.Scanner;

public class FractionalWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        int factorial =1;
        for (int i = 1; i<=n; i++){
            factorial = factorial * i ;
        }
        System.out.println("Factorial of "+n+" is "+factorial);
        scanner.close();
    }
}
import java.util.Scanner;

public class SumOfnNumberWithWhile {
    public static void main(String[] args) {
        System.out.println("Enter the number of even numbers you want to add : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int sum = 0;
        while (a<=n) {
            sum = sum + (2*a);
            a++;
        }
        System.out.println("Sum of even numbers of "+ n +"th term are: " + sum);
        sc.close();
    }
}

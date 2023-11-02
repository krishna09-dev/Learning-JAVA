import java.util.Scanner;

public class SumOfnEvenNumberWithFor {
    public static void main(String[] args) {
        System.out.println("Enter the number of even numbers you want to add : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + (2*i);
            
        }
        System.out.println("Sum of even numbers of "+ n +"th term are: " + sum);
        sc.close();
    }
}

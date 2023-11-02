import java.util.Scanner;

public class SumOfTableOfnNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number which table sum u want");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + ( n * i );
        }
        System.out.println("The sum of the table of "+n+" is :" + sum );
        sc.close();
    }
}

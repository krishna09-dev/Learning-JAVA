import java.util.Scanner;

public class PatternUsingFor {
    public static void main(String[] args) {
        System.out.println("Number of Rows u want to print : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int a =  rows;
        for (int i = a ; i>=1; i--)
        {
            for (int j = i; j>=1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

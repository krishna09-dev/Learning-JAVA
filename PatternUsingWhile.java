import java.util.Scanner;

public class PatternUsingWhile {
    public static void main(String[ ]args){
        System.out.println("Enter the number of rows u want ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int i=n;
        while(i>=1){
            int j=i;
            while (j>=1) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}

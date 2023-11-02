import java.util.Scanner;

public class MultiTableOfnInReverse {
     public static void main(String[] args) {
        System.out.println("Enter the number of table which u want in reverse order");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 10; i>=1; i--){
            System.out.println(n + "x" + i + "=" + n*i);
        }
        sc.close();
    }
}

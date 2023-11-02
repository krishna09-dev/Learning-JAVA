import java.util.Scanner;

public class MultiTAbleOfnNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number of table which u want");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(n+ "x" + i +"="+ n*i);
        }
        sc.close();
    }
}

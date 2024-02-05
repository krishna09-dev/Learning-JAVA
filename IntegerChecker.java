import java.util.Scanner;


public class IntegerChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to check: ");
        System.out.println(sc.hasNextInt());
        sc.close();
        
    }
}

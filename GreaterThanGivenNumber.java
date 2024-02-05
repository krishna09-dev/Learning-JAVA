import java.util.Scanner;
public class GreaterThanGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println(num>5);
        sc.close();

    }
}

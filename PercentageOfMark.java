import java.util.Scanner;

public class PercentageOfMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark of first subject");
        float first = sc.nextFloat();
        System.out.println("Enter the msrk of second subject");
        float second = sc.nextFloat();
        System.out.println("Enter the mark of third subject");
        float third = sc.nextFloat();
        float total = first+second+third;
        float percentage = (total/300)*100;
        System.out.println("your percentage is : "+percentage);
        sc.close();
    }
}

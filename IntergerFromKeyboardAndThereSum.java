///Take 10 integers from keyboard using loop and print their average value on the screen.



import java.util.Scanner;

public class IntergerFromKeyboardAndThereSum {
    public static void main(String[] args) {
        System.out.println("Enter the 10 numbers");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i<10; i++) {
            sum = sum+sc.nextInt();
            
        }
        System.out.println(sum);
        sc.close();
    }
}

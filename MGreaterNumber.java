//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

import java.util.Scanner;

public class MGreaterNumber {
    static void greater(int a, int b, int c){ // make a method name greater
        // checkes the greates number using loop
        if (a>b && a>c) {
            System.out.println(a+" is the greatest number ");
        }else if (b>a && b>c) {
            System.out.println(b+ " is greatest number");
        }else{
            System.out.println(c+ " is greatest ");
        }
    }
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /// asks the user for the number
        System.out.println("enter 1st number");
        int x = sc.nextInt();
        System.out.println("enter 2nd number");
        int y = sc.nextInt();
        System.out.println("enter 3rd number");
        int z = sc.nextInt();
        /// calls the greater method which we created
        greater(x, y, z);
        sc.close();
    }
}

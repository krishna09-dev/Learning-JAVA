///Define a method that returns the product of two numbers entered by user.


import java.util.Scanner;

public class Mproduct {
    static int product(int a, int b){// method for multiplication
        return a * b;// does multiplication sends the value back
    }
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /// takes number as input from user
        System.out.println("enter the first  number");
        int x = sc.nextInt();
        System.out.println("enter the second number");
        int y = sc.nextInt();
        //calls product method and saves the return value in result
        int result = product(x, y);
        System.out.println(result);
        sc.close();
    }
}

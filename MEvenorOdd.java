// Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class MEvenorOdd {
    static void check(int a){// method to check even or odd number
        if (a%2 == 0) {// check the number is even or odd
            System.out.println("it is even number");
        } else {
            System.out.println("it is odd number");
        }
    }
    //main method
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // takes number as input from user
        System.out.println("Enter the number u want to check");
        int x = sc.nextInt();
        // calls check method 
        check(x);
        sc.close();
    }
}

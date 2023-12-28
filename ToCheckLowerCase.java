/*Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ). */

import java.util.Scanner;

public class ToCheckLowerCase {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String check = sc.nextLine();
        //char ch = sc.next();
        String lower = check.toLowerCase();
        if (check.equals(lower)) {
            System.out.println("its in lower case");
        }else{
            System.out.println("its not in lower case");
        }
        sc.close();
    }
}
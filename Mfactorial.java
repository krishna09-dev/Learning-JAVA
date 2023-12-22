//Write a program to print the factorial of a number by defining a method named 'Fact'.

import java.util.Scanner;

public class Mfactorial {
    static int fact(int x){
        if (x==1 || x==0) {
        return x;            
        }else{
            return fact(x-1)*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int result = fact(a);
        System.out.println("The factorial of "+a+"="+result);
        sc.close();
    }
}

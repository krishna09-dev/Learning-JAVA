///sum of two number

import java.util.*;
public class sumOf2number{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt(); 
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        int sum = a+b ;
        System.out.print("The sum of "+a+" and "+b+" is : "+sum); 
        sc.close();
    
    }

}
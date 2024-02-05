/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
*/


import java.util.Scanner;
public class DiscountCalculator {
    public static void main(String args[]){
        System.out.println("Enter the number of quantity");
        Scanner sc = new Scanner(System.in);
        int numberofquantity = sc.nextInt();
        int total = (numberofquantity*100);
        float dis = total - (total*0.1f);
        if (numberofquantity >= 10) {
            System.out.println("your total is"+total);
            System.out.println("Congrat u got discout and your bill after discount is ="+dis);
        } else{
            System.out.println("your total is "+total);
            System.out.println("sorry u cant get discount");
        }
        sc.close();
    }
}

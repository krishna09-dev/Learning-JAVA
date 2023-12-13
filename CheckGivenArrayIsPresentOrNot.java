

///CheckGivenArrayIsPresentOrNot

import java.util.Scanner;

public class CheckGivenArrayIsPresentOrNot {
    public static void main(String[] args) {
        int [] num = {12 ,324 ,546 ,12 ,34 ,45 };
        Scanner sc = new Scanner(System.in);
        /// takes int as input to check 
        System.out.println("Enter a number to check: ");
        int toCheck = sc.nextInt();
        // takes every elemets using for each
        for (int e : num) {
            // take every element and check with give input
            if (e==toCheck){
                System.out.println("its there");
                break;
            }
            else{
                System.out.println("its not there");
                break;
            }
        }
        sc.close();
    }
}

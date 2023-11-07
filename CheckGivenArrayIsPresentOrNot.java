///CheckGivenArrayIsPresentOrNot

import java.util.Scanner;

public class CheckGivenArrayIsPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = {12 ,324 ,546 ,12 ,34 ,45 };
        System.out.println("Enter a number to check: ");
        int toCheck = sc.nextInt();
        for (int e : num) {
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

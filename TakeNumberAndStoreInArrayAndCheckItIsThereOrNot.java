////Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
// Now, tell user whether that number is present in array or not.

import java.util.Scanner;

public class TakeNumberAndStoreInArrayAndCheckItIsThereOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // makes the size of array said by user
        System.out.println("Whats the size of array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        /// Stores the value in array
        for(int i = 0; i<arr.length;i++){
            System.out.println("enter the element of array one by one");
            arr[i]=sc.nextInt();
        }
        ///checks is there value or not is yes then boolean will be made yes if no it will remain same false
        System.out.println("Enter the number u want to check");
        int num = sc.nextInt();
        boolean checked = false;
        for (int j : arr) {
            for (int i = 0; i < arr.length; i++) {
                if (j==num) {
                    checked=true;
                    break;
                }
            }
        }
        ///gives out put according to boolean 
        if(checked){
            System.out.println("it is there");
        }else{
            System.out.println("it is not there");
        }
        sc.close();
    }
}

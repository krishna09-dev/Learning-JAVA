///Take  integer inputs from user and store them in an array and print them on screen.

import java.util.Scanner;

public class TakeNumberAndStoreInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // makes the size of array said by user
        System.out.println("Whats the size of array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        ///stores the values provided by user to store in array
        for(int i = 0; i<arr.length;i++){
            System.out.println("enter the element of array one by one");
            arr[i]=sc.nextInt();
        }
         /// displays array
        for (int j : arr) {
            System.out.print(j);
        }
        sc.close();
    }
}

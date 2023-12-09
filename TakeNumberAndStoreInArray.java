///Take  integer inputs from user and store them in an array and print them on screen.

import java.util.Scanner;

public class TakeNumberAndStoreInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Whats the size of array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<arr.length;i++){
            System.out.println("enter the element of array one by one");
            arr[i]=sc.nextInt();
        }
        for (int j : arr) {
            System.out.print(j);
        }
        sc.close();
    }
}

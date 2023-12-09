//Take 10 integer inputs from user and store them in an array.
// Now, copy all the elements in an another array but in reverse order.

import java.util.Scanner;

public class TakeIntInArrayAndReverseIt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Whats the size of array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<arr.length;i++){
            System.out.println("enter the element of array one by one");
            arr[i]=sc.nextInt();
        }
        int temp;
        int repet = n/2;
        for (int i = 0; i <= repet; i++) {
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        for (int i : arr) {
            System.out.print(i+" , ");
        }
        sc.close(); 
    }
}


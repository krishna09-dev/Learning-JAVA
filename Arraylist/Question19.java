package Arraylist;

import java.util.ArrayList;

// Write a Java program to trim the capacity of an array list the current list size. 

public class Question19 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        System.out.println("Original Size: " + num.size());

        // Trim the capacity to the current size
        num.trimToSize();
        
        // Print new size and capacity
        System.out.println("New Size: " + num.size());
        
    }
}

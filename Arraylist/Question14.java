package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program of swap two elements in an array list. 

public class Question14 {
    public static void main(String[] args) {
        ArrayList<Number> num1 = new ArrayList<Number>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        num1.add(6);
        System.out.println("before swapping");
        System.out.println(num1);
        System.out.println();
        Collections.swap(num1, 2, 4);
        System.out.println("after swapping");
        System.out.println(num1);
    }
}

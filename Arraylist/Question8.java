package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to sort a given array list. 

public class Question8 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(6);
        num.add(2);
        num.add(5);
        num.add(3);
        num.add(4);
        System.out.println("Before Sorting");
        System.out.println(num);
        System.out.println();
        System.out.println("After Sorting");
        Collections.sort(num);
        System.out.println(num);
    }
}

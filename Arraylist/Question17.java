package Arraylist;

import java.util.ArrayList;

// Write a Java program to empty an array list. 

public class Question17 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        
        System.out.println("Before making it empty");
        System.out.println(num);
        System.out.println();
        System.out.println("After making it empty");
        num.clear();
        System.out.println(num);
    }
}

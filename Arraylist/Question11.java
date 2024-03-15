package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to reverse elements in a array list. 

public class Question11 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        System.out.println("Before reverse");
        System.out.println(num);
        System.out.println();
        Collections.reverse(num);
        System.out.println("After reverse");
        System.out.println(num);

    }
}

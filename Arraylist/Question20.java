package Arraylist;

import java.util.ArrayList;

// Write a Java program to increase the size of an array list. 

public class Question20 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.ensureCapacity(8);
    }
}

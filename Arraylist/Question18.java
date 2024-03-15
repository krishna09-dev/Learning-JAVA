package Arraylist;

import java.util.ArrayList;

// Write a Java program to test an array list is empty or not.

public class Question18 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        System.out.println("Should give answer false : "+ num.isEmpty());
        System.out.println(num);
        num.removeAll(num);
        System.out.println();
        System.out.println("Should give answer true : "+ num.isEmpty());
        System.out.println(num);
    }
}

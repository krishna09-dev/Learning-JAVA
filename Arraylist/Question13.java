package Arraylist;

import java.util.ArrayList;

// Write a Java program to compare two array lists.

public class Question13 {
    public static void main(String[] args) {
        ArrayList<Number> num1 = new ArrayList<Number>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        num1.add(6);

        ArrayList<Number> num2 = new ArrayList<Number>();
        num2.add(1);
        num2.add(2);
        num2.add(3);
        num2.add(4);
        num2.add(5);
        num2.add(6);

        boolean ans = num1.equals(num2);
        System.out.println("Should be equal : "+ans);

        num2.add(7);
        boolean ans1 =num1.equals(num2);
        System.out.println("Should not be equal : "+ans1);
    }
}

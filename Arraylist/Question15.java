package Arraylist;

import java.util.ArrayList;

// Write a Java program to join two array lists. 

public class Question15 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        // method 1
        // ArrayList<Number> num2 = new ArrayList<Number>();
        // num2.addAll(num);
        // num2.add(7);
        // num2.add(8);
        // num2.add(9);
        // num2.add(10);
        // num2.add(11);
        // num2.add(12);

        // method 2
        // ArrayList<Number> num2 = new ArrayList<Number>(num);
        // num2.add(7);
        // num2.add(8);
        // num2.add(9);
        // num2.add(10);
        // num2.add(11);
        // num2.add(12);

        // method 3
        ArrayList<Number> num2 = new ArrayList<Number>();
        for (Number number : num) {
            num2.add(number);
        }
        num2.add(7);
        num2.add(8);
        num2.add(9);
        num2.add(10);
        num2.add(11);
        num2.add(12);
        System.out.println(num);
        System.out.println(num2);
    }
}

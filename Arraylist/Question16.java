package Arraylist;

import java.util.ArrayList;

// Write a Java program to clone an array list to another array list. 

public class Question16 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        ArrayList<Number> num2 = new ArrayList<Number>(num);
        System.out.println(num);
        System.out.println(num2);
    }
}

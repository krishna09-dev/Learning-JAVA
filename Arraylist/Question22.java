package Arraylist;

import java.util.ArrayList;

// Write a Java program to print all the elements of a ArrayList using the position of the elements. 

public class Question22 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
    }
}

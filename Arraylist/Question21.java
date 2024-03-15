package Arraylist;

import java.util.ArrayList;

// Write a Java program to replace the second element of a ArrayList with the specified element. 

public class Question21 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        System.out.println("Before replacing");
        System.out.println(num);
        System.out.println();
        num.set(2, 10);
        System.out.println("After replacing");
        System.out.println(num);
    }
}

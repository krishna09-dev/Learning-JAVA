package Arraylist;

import java.util.ArrayList;

// Write a Java program to insert an element into the array list at the first position. 

public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<String>();
        text.add("Hi");
        text.add("Hello");
        text.add("Hey");
        text.add("Howdy");
        text.add("Namaste");
        System.out.println("Before Adding");
        System.out.println(text);
        System.out.println();
        text.add(0, "Khamma Ghani");
        System.out.println("After adding");
        System.out.println(text);
    }
}

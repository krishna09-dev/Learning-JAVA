package Arraylist;

import java.util.ArrayList;

// Write a Java program to remove the third element from a array list.

public class Question6 {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<String>();
        text.add("Khamma Ghani");
        text.add("Hi");
        text.add("Hello");
        text.add("Hey");
        text.add("Howdy");
        text.add("Namaste");
        System.out.println("Before Removing element of 3rd index");
        System.out.println(text);
        System.out.println();
        text.remove(3);
        System.out.println("After Removing");
        System.out.println(text);

        
    }
}

package Arraylist;

import java.util.ArrayList;

// Write a Java program to update specific array element by given element. 

public class Question5 {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<String>();
        text.add("Hi");
        text.add("Hello");
        text.add("Hey");
        text.add("Howdy");
        text.add("Namaste");
        System.out.println("Before updating");
        System.out.println(text);
        System.out.println();
        text.set(0, "Khamma Ghani");
        System.out.println("After updating");
        System.out.println(text);
    }
}

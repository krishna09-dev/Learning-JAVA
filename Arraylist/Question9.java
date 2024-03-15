package Arraylist;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to copy one array list into another.

public class Question9 {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<String>();
        text.add("Khamma Ghani");
        text.add("Hi");
        text.add("Hello");
        text.add("Hey");
        text.add("Howdy");
        text.add("Namaste");

        // method 1

        // ArrayList<String> text2 = text;
        // System.out.println(text);
        // System.out.println(text2);

        // method 2

        // ArrayList<String> text2 = new ArrayList<String>();
        // for (String element : text) {
        //     text2.add(element);
        // }
        // System.out.println(text);
        // System.out.println(text2);

        // method 3

        // ArrayList<String> text2 = new ArrayList<String>();
        // text2.addAll(text);
        // System.out.println(text);
        // System.out.println(text2);

        // method 4
        
        ArrayList<String> text2 = new ArrayList<String>(List.copyOf(text));
        System.out.println(text);
        System.out.println(text2);
    }
}

package Arraylist;

import java.util.ArrayList;

// Write a Java program to search an element in a array list. 

public class Question7 {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<String>();
        text.add("Hi");
        text.add("Hello");
        text.add("Hey");
        text.add("Howdy");
        text.add("Namaste");
        text.add("Khamma Ghani");
        System.out.println("Hey is present in the arraylist : "+text.contains("Hey"));
        System.out.println("The index of Hey in the arraylist is "+text.indexOf("Hey"));
    }
}

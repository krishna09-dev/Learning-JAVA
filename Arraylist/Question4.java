package Arraylist;

import java.util.ArrayList;

// Write a Java program to retrieve an element (at a specified index) from a given array list. 

public class Question4 {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<String>();
        text.add("Hi");
        text.add("Hello");
        text.add("Hey");
        text.add("Howdy");
        text.add("Namaste");
        System.out.println("The element of index 2 or position 3 is : "+text.get(2));
    }
}

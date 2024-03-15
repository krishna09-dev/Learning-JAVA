package Arraylist;

import java.util.ArrayList;

// Write a Java program to iterate through all elements in a array list.

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        for(Number i : num){
            System.out.println(i);
        }

        System.out.println();
        ArrayList<String> text = new ArrayList<String>();
        text.add("Hello");
        text.add("Hi");
        text.add("Hey");
        text.add("Howdy");
        for(String j : text){
            System.out.println(j);
        }
    }
}

package Arraylist;

import java.util.ArrayList;

public class Question12 {
    public static void main(String[] args) {
        ArrayList<Number> num = new ArrayList<Number>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        ArrayList<Number> subnum = new ArrayList<Number>(num.subList(0, 3));
        System.out.println(num);
        System.out.println(subnum);
    }
}

 import java.util.*;
public class ReplaceSpaceToDase {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String line = sc.nextLine();
        String replace = line.replace(' ','-');
        System.out.println("The lower case of the entered string is "+replace);
        sc.close();
    }
}


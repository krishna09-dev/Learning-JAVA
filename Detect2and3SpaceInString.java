

///Detect2and3SpaceInString


import java.util.Scanner;

public class Detect2and3SpaceInString {
    public static void main(String[] args) {
        System.out.println("Enter a Sentence.");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line.indexOf("  "));
        System.out.println(line.indexOf("   "));
        sc.close();

    }
}

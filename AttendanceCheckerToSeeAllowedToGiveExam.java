/*
A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
 */



import java.util.Scanner;

public class AttendanceCheckerToSeeAllowedToGiveExam {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of classes");
    int classhappened = sc.nextInt();
    System.out.println("enter number of classes attened");
    int classattende = sc.nextInt();
    double percentage = ((double)classattende/classhappened)*100;  /// int operated with intege gives int so we need to use doble to get double value
    
    /*modified question if he or she has medical issue */

    System.out.println("did u had any medical issues 'y or n'");
    String question = sc.next();

    if (percentage>=75) {
        System.out.println("your percentage is" +percentage);
        System.out.println("u can give exam");
    } else{
        System.out.println("your percentage is"+ percentage);
        System.out.println("u can not give exam ");
    }

    /*modified question if he or she has medical issue */

    if (question.equals("y")) {/// .equals to check string is same or not == only for number
        System.out.println("u can give exam bcz u had medical issuse");
    }else{
        System.out.println("u can not give exam beacuse u have less than 75% attendance without any medical issue");
    }
    sc.close();
}
}
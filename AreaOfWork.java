/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR". */

import java.util.Scanner;

public class AreaOfWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("please enter your gender as (M or F)");
        String sex = sc.next();
        System.out.println("enter your marital status as (Y or N )");
        String status = sc.next();
        if (sex.equals("F")) {
            System.out.println("you can only work in urban areas");
        }else{
            if (age>=20 && age<=40) {
                System.out.println("u can work anywhwere");
            }else{
                if (age>=40 && age<=60) {
                    System.out.println("you can only work in urban areas");
                } else{
                    System.out.println("ERROR");
                }
            }
        }
        sc.close();
    }
}

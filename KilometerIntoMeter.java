import java.util.Scanner;

public class KilometerIntoMeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The distance in Kilometer which u want to convert into MIles");
        float Kilometer = sc.nextFloat();
        float Miles = Kilometer*0.621371f;
        System.out.println(Kilometer+" kilometer is  equal to "+ Miles+"miles");
        sc.close();
    }
}

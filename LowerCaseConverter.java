import java.util.*;;
public class LowerCaseConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String line = sc.nextLine();
        String lower = line.toLowerCase();
        System.out.println("The lower case of the entered string is "+lower);
        sc.close();
    }
}
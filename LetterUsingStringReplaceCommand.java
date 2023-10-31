import java.util.Scanner;

public class LetterUsingStringReplaceCommand {
    public static void main(String[] args) {
        String line = "Dear <|Name|>, Thanks a lot";
        System.out.println(line);
        System.out.println("enter the name u want to add");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        line = line.replace("<|Name|>","krishna");//1sst method
        System.out.println(line);
        System.out.println("\"Dear "+ name +", Thanks a lot\"");//2nd method
        sc.close();
    }
}

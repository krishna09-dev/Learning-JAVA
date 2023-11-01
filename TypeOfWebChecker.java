import java.util.Scanner;

public class TypeOfWebChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full website");
        String Website = sc.next();
        if (Website.endsWith(".org")) {
            System.out.println("Its a Organization Website");
        } else {
            if (Website.endsWith(".com")) {
                System.out.println("Its a Organization Website");
            } else {
                if (Website.endsWith(".in")) {
                     System.out.println("Its a indian Website");
                }
                else{
                  if (Website.endsWith(".np")) {
                    System.out.println("Its a nepali website");
                  }
                  else{
                      System.out.println("we cant help");
                  }
                }
            }
        } 
        sc.close();
    }       
}


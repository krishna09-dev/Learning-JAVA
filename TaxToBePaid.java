import java.util.Scanner;

public class TaxToBePaid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary anount");
        int salary = sc.nextInt();
        if (salary<250000) {
            System.out.println("You have zero Taxes");
        } else {
            if (salary>=250000 && salary<=500000) {
                float tax = (salary-250000)*0.05f;
                System.out.println("You have "+tax+ "Rs as taxes"); ///float is used in tax bcz if there will be int 3/10=0.3 where int will take only number before.
            } else {
                if (salary>=500000 && salary<=1000000) {
                float tax = 500000*0.05f;
                float tax2 = (salary-250000-500000)*0.1f;
                float totaltax = tax+tax2;
                System.out.println("You have "+totaltax+ "Rs as taxes");
                System.out.println(tax2);
                System.out.println(tax);
                } else {
                    if (salary>1000000 ) {
                    float tax = 500000*0.05f;
                    float tax2 = 1000000*0.1f;
                    float tax3 = (salary-250000-500000-1000000)*0.3f;
                    float finaltax = tax+tax2+tax3;
                    System.out.println("You have "+finaltax+ "Rs as taxes");
                    System.out.println(tax3);
                    }
                }
                
            }
            
        }

        sc.close();
    }
}

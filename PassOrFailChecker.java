import java.util.Scanner;

public class PassOrFailChecker {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark of first Subject");
        float sub1 = sc.nextFloat();
        System.out.println("Enter the mark of second Subject ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter mark of third subject");
        float sub3 = sc.nextFloat();
        float perofsub1 = (sub1/100)*100f;
        float perofsub2 = (sub2/100)*100f;
        float perofsub3 = (sub3/100)*100f;
        float totalmark = (sub1+sub2+sub3);
        float totalpercantage = totalmark/3.0f;
        System.out.println("total percentage is :" +totalpercantage+"%");

        //easy method
        if (totalpercantage>=40 && perofsub1>=33 && perofsub2>=33 && perofsub3>=33) {
            System.out.println("your percdntage is : "+ totalpercantage+"%");
             System.out.println("You are Pass");
        } else {
            System.out.println("your total percentage is : "+ totalpercantage+"%");
            System.out.println("You are Pass");
        }

        /* 

                long method


        if ( perofsub1 >= 33) 
        {
            if (perofsub2 >= 33) 
            {
                if (perofsub3 >= 33) 
                {
                    if (totalpercantage >= 40) 
                    {
                        System.out.println("your percdntage is : "+ totalpercantage+"%");
                        System.out.println("You are Pass");
                        
                    } 
                    else 
                    {
                        System.out.println("your total percentage is : "+ totalpercantage+"%");
                        System.out.println("You are fail");
                    }
                    
                } 
                else 
                {
                    System.out.println("your total percentage is : "+ totalpercantage+"%");
                    System.out.println("You are fail");
                    
                }
                
            } 
            else 
            {
                System.out.println("your total percentage is : "+ totalpercantage+"%");
                System.out.println("You are fail");
                
            }
            
        } 
        else 
        {
            System.out.println("your total percentage is : "+ totalpercantage+"%");
            System.out.println("You are fail");
            
        }*/
        sc.close();
    }
}

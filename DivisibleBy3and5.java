/**
 * DivisibleBy3and5
 */
public class DivisibleBy3and5 {
    public static void main(String[] args) {
        int num = 2;
        if ((num%3)==0 && (num%5)==0) {
            System.out.println("it is divisible by both 3 and 5");
        } else if ((num%3)==0 || (num%5)==0) {
            if ((num%3)==0) {
                System.out.println("it is only divisible by 3");
            } else{
                System.out.println("it is only divisible by 5");
            }
        }else{
            System.out.println("it is not divisble by both");
        }
    }
}
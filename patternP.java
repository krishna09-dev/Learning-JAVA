
/**
 * patternP
 *            *
 *           * *
 *          * * *
 *         * * * *
 *        * * * * *
 */
public class patternP {
    public static void main(String[] args) {
        int a =  5;
        for (int i = 1 ; i<=5; i++)
        {
            for (int j =a-1 ; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k>=1; k--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

        
    }
}
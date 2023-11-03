public class MaxValueInArray {
    public static void main(String[] args) {
        int [] num = {1,22,45,67,86,34,23};
        int maximum = Integer.MIN_VALUE;
        for (int e: num) {
         if (e > maximum) {
            maximum = e ;
        }            
        }
        System.out.println(maximum);
    }
}

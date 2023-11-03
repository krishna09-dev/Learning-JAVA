public class MinValueInArray {
    public static void main(String[] args) {
        int [] marks = {-1,-2,3,4,5,6,7,8,9,10};
        int min = Integer.MAX_VALUE;
        for (int e: marks) {
            if (e<min) {
                min = e;
            }
        }
        System.out.println(min);
    }
}

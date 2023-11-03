public class AverageOfAArray {
    public static void main(String[] args) {
        int [] num = {12 ,324 ,546 ,656 ,34 ,45 };
        int sum = 0;
        for (int element : num) {
            sum = sum+element;
        }
        int average = sum/num.length;
        System.out.println(average);
    }
}

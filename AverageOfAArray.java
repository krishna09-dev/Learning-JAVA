///AverageOfAArray


public class AverageOfAArray {
    public static void main(String[] args) {
        int [] num = {12 ,324 ,546 ,656 ,34 ,45 };
        int sum = 0;
        /// uses for each to get each elemet
        for (int element : num) {
            ///adds each elemet to sum
            sum = sum+element;
        }
        //finds the sum
        int average = sum/num.length;
        System.out.println(average);
    }
}



public class PrintArrayInReverse {
    public static void main(String[] args) {
        int [] marks = {1,2,3,4,5,6,7,8,9,10};
        int n = marks.length-1 ;
        for (int i = n; i>=0; i--) {
            System.out.println(marks[n]);
            n--;
        }
    }
}

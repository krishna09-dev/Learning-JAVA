public class ReverseArray {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9};
        int n = num.length;
        int temp;
        for (int e: num) {
            System.out.print(e+" ");
        }
        for (int i = 0; i<n/2; i++) {
            temp = num[i];
            num[i] = num[n-i-1];
            num[n-i-1] = temp;
        }
        System.err.println();
        for (int e: num) {
            System.out.print(e+" ");
        }
    }
}

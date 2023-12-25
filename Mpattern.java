/**
 * Mpattern
 */
public class Mpattern {

    public static void main(String[] args) {
        int count = 0, num = 3452;

    while (num != 0) {
      num = num/10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
    int n =234;
    int a=n;
    for (int i = 1; i<=3; i++) {
        a=a%10;
        n=n-a;
    System.out.println(n);
    }
    }
}
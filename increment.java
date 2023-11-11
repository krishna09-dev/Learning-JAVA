public class increment {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        //post-increment
        System.out.println("value of a = " + a++);
        System.out.println("value of b = " + b++);

        //pre-increment
        System.out.println("value of a = " + ++a);
        System.out.println("value of b = " + ++b);
    }
}

public class noOfPrime1To100 {
    public static void main(String[] args) {
        int count = 0;
        boolean isPrime;

        for (int i = 2; i <= 100; i++) {
            isPrime = true; // Assume i is prime initially

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false; // If i is divisible by any number other than 1 and itself, it's not prime
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println("Total number of prime numbers between 1 and 100 is: " + count);
    }
}

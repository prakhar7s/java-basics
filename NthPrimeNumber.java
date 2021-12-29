class NthPrimeNumber {
    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            int nthPrimeNum = nthPrime(n);
            System.out.println(nthPrimeNum);

        }

    }

    public static int nthPrime(int n) {

        if (n == 1)
            return 2;

        int start = 3;
        int currPrimeCount = 1;

        while (true) {
            boolean isPrime = true;
            for (int i = 2; i <= start / 2; i++) {
                if (start % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                currPrimeCount++;
            }

            if (currPrimeCount == n) {
                return start;
            }

            start++;
        }

    }
}
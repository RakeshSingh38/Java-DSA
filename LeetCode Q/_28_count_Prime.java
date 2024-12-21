import java.util.Arrays;

public class _28_count_Prime {

    // Sieve of Stratagones 
    public static int countPrimes(int n) {
        int count = 0;
        if (n <= 1) {
            return 0;
        }
        /*
         * ye use kr agr warning deta ki sc close kr 👍
         */
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int prime = 2; prime * prime <= n; prime++) {
            if (isPrime[prime]) {
                for (int i = prime * prime; i < n; i += prime) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
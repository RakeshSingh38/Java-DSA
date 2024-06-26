
import java.util.Scanner;

public class _1_prime_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int in = sc.nextInt();
        int n = 20;
        //boolean primeOrNot = isPrime(in);
        //System.out.println(primeOrNot);
        for (int i = 1; i <= n; i++) {
            //System.out.println(i + " " + isPrime(i));
        }
        System.out.println(sqrt(4)+" square OF NO.");
        System.out.println(1 ^ 1);
        System.out.println(divide(1, 2));

        // if a number is odd then its last bit is 1
        // if a number is even then its last bit is 0
        System.out.println(10011 & 1);

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }

    static int sqrt(int n) {
        int i = 1;
        while (i * i <= n) {
            i++;
        }
        return i - 1;
    }

    static double divide(int a, int b) {
        return (double) a / b;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int prime = 2; prime <= n / prime;) {
            if (n % prime == 0) {
                //System.out.println(prime+" ");
                return false;
            }
            //System.out.println(prime+" ");
            prime++;
        }

        return true;
    }
}
//System.out.println(n);

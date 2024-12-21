//package Competetive programming;

import java.util.Scanner;

public class _4_Missing_number_cses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = (long) sc.nextLong();

        long expected = n * (n + 1) / 2;

        long temp = 0;
        for (int i = 0; i < n - 1; i++) {
            temp += sc.nextLong();
        }

        System.out.println(expected - temp);
        sc.close();
    }
}

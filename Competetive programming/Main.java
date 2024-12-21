//package Competetive programming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // imp          make sure to make the input as long coz the Elements can exceed the size of the integer
        long n = (long) sc.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + " ");
            } else {
                n = 3 * n + 1;
                System.out.print(n + " ");
            }
            sc.close();
        }
    }
}

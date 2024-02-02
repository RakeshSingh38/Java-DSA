// fix     Make sure u import below line else error  

import java.util.Scanner;

public class _5_Q {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            // System.out.println(" "+a+b);
            // -> it shows concatenation of numbers

            System.out.println("sum is " + sum);

            // System.out.println(" "+a*+b);
            // System.out.println(" "+a/+b);
            // r It works ( arithmetic operations working)

            System.out.println(" multiply is " + (a * b));
            // see parenthesis working properly in this eg.
        }

        // System.out.println(" \d",a+b);

    }
}

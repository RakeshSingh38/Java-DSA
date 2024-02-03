import java.util.Scanner;

/* 
    Write a program that prints the numbers from 1 to N. For multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz". For numbers that are multiples of both 3 and 5, print "FizzBuzz". Write a function that takes an integer N as input and prints the FizzBuzz sequence up to N.

Input format
An integer N represents the range of numbers to print.

Sample Input:
5

Output format
The program should print the output of the FizzBuzz sequence up to the given range.

Sample Output:
1
2
Fizz
4
Buzz
 */

// Q = FizzBuzz problem    
public class _7_FizzBuzz_problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int inputN = scanner.nextInt();
        fizzBuzz(inputN);
        scanner.close();
    }

    static String fizzBuzz(int N) {
        int a = 3;
        int b = 5;
        int i;
        for (i = 1; i <= N; i++) {
            // r      To find multiple of any number ( i % Number == 0 )
            if (i % 3 == 0 && i % 5 == 0) {
                a += 3;
                b += 5;
                System.out.println("FizzBuzz");
                continue;
            }
            if (i == a) {
                a += 3;
                System.out.println("Fizz");
                continue;
            }
            if (i == b) {
                b += 5;
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
        return String.valueOf(i);
    }
}

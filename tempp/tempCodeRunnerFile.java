//import java.util.Scanner;
//import java.util.*;

//class tempCodeRunnerFile {

import java.util.Scanner;

public class tempCodeRunnerFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter two integers (a and b, where b is not zero):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Check if b is not zero
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Perform division and round to two decimal places
            double result = a / b;
            result = Math.round(result * 100.0) / 100.0;

            // Output the result
            System.out.println("Result of division rounded to two decimal places: " + result);
        }

        scanner.close();
    }
}
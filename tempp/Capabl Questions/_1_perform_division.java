import java.util.Scanner;

// Q    = To perform division of two numbers (a/b) and round the result to two decimal places
public class _1_perform_division {
    static double performDivision(int a, int b) {
        double result = (double) a / b;
        result = Math.round(result * 100.0) / 100.0;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double result = performDivision(num1, num2);
        System.out.printf("%.2f%n", result);
        scanner.close();
    }
}

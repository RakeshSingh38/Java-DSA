import java.util.Scanner;

/**
 * _3_To_print_patterns
 */
public class _3_To_print_patterns {
    static void printPattern(int size) {
        for (int i = 1; i <= size; i++){

            for (int j = 1; j <=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSize = scanner.nextInt();
        printPattern(inputSize);
        scanner.close();
    }

}
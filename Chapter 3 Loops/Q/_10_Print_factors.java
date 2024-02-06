import java.util.Scanner;

// Q     program to find factors of numbers
public class _10_Print_factors {
    public static void main(String[] args) {
        //int num = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :  ");
        int num = sc.nextInt();
        System.out.print("\nFactors are ");
        // i used try and catch to filter the error of divide by 0
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println("\n");
        sc.close();
    }

}
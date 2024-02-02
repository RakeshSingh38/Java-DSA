import java.util.Scanner;

// To check whether a a number is Odd or Even
public class temp {
    static void oddOrEven(int n) {
        if (n % 2 != 0) {
            System.out.println("Odd");
        } else
            System.out.println("Even");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int character = scanner.nextInt();
        oddOrEven(character);
        scanner.close();  
    }   
}
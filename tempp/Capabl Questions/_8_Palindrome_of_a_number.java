import java.util.Scanner;

public class _8_Palindrome_of_a_number {
    static boolean isPalindrome(String str) {

        // write below logic in one line
        //String check = (new StringBuilder(str).reverse()).toString();
        //return check.equals(str);

        return (new StringBuilder(str).reverse().toString().equals(str));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        boolean result = isPalindrome(inputString);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class Main {

    public static boolean isValidCharacter(char ch) {
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'));
    }

    public static char toLowercase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch - 'A' + 'a');
        }
        return ch;
    }

    public static String reverseName(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    public static boolean isPalindrome(String name) {
        int start = 0;
        int end = name.length() - 1;
        while (start <= end) {
            if (name.charAt(start) != name.charAt(end)) {
                System.out.println("s " + name.charAt(start));
                System.out.println(name.charAt(end));
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static int showLength(String name) {
        return name.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (isValidCharacter(s.charAt(i))) {
                temp += s.charAt(i);
            }
        }

        System.out.println(temp);
        System.out.println("Convert character into lowercase");
        System.out.println("temp len " + temp.length());
        temp = temp.toLowerCase();
        System.out.println(temp);

        System.out.println("Check palindrome");
        if (isPalindrome(temp)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        scanner.close();
    }
}
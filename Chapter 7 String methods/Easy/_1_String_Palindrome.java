public class _1_String_Palindrome {

    // Q      1. Write a program to check whether a given string is palindrome or not.

    // tip      theres a simple way to do it using recursion , check recursion folder
    // 3_palindrome_of_number_or_string_using_recursion

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

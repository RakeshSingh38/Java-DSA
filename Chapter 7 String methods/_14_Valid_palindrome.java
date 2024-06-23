/**
 * This class checks if a given string can be a palindrome by removing at most one character.
 */

// Leetcode 680. Valid Palindrome II (Easy) 
// Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//url : https://leetcode.com/problems/valid-palindrome-ii/


public class _14_Valid_palindrome {
    public static void main(String[] args) {
        String str = "abca";

        System.out.println(validPalindrome(str));

    }

    /* 
    
    The validPalindrome method uses two pointers to check for mismatches and calls the isPalindrome method to verify if the string can be a palindrome by removing one character.
    
    The isPalindrome method checks if a substring is a palindrome using a two-pointer technique
    
     */
    /**
     * Checks if a given string can be a palindrome by removing at most one character.
     *
     * @param s the input string to be checked
     * @return true if the string can be a palindrome by removing at most one character, false otherwise
     */
    private static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindrome(String s, int left, int right) {
        /* String str = s.substring(left, right + 1);
        String sb = new StringBuilder(str).reverse().toString();
        return str.equals(sb);*/
        // r        StringBuilder is somewhat slower than the below code
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}

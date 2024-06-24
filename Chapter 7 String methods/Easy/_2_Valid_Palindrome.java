// Leetcode 125. Valid Palindrome (Easy) 
// Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
// url : https://leetcode.com/problems/valid-palindrome/

public class _2_Valid_Palindrome {
    public static void main(String[] args) {
        String s = " A man, a plan, a canal: Panama";
        System.out.println(s.trim());
    }
        public static boolean isPalindrome(String s) {
            s.trim();
            System.out.println(s);
            return checker(s);
        }

        private static boolean checker(String str) {
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

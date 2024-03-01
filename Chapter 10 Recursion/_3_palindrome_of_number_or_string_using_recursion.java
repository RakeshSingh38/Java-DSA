
public class _3_palindrome_of_number_or_string_using_recursion {
    public static void main(String[] args) {
        char ch[] = { 'm', 'a', 'd', 'a', 'm' };
        System.out.println(isPalindrome(ch, 0, ch.length - 1));
    }

    private static boolean isPalindrome(char ch[], int s, int e) {
        if (s == e||s>e)
            return true;

        if (ch[s] == ch[e]) {
            boolean temp = isPalindrome(ch, s + 1, e - 1);
            return temp;
        } else {
            return false;
        }
    }
}

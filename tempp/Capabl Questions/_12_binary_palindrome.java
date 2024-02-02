public class _12_binary_palindrome {
    public static void main(String[] args) {
        //System.out.println(isPalindrome(21));
        int p = 21;
        boolean binaryPalindrome = isPalindrome(Integer.parseInt(Integer.toBinaryString(p)));
        System.out.println(binaryPalindrome);
    }

    static boolean isPalindrome(int p) {
        int rev = 0;
        int temp = p;
        while (temp != 0) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp /= 10;
        }

        return rev == p;
    }
}

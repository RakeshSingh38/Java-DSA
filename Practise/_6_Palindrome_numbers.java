public class _6_Palindrome_numbers {
    public static void main(String[] args) {
        int n = 3553;
        System.out.println(isPalindrome(n));
        System.out.println(reverse(n));
    }

    static boolean reverse(int n) {
        int reverse = 0;
        int temp = n;
        //temp++;
        while (temp != 0) {
            int lastDigit = temp % 10;
            //n /= 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp / 10;
        }
        System.out.println("original is " + n + " and reverse is " + reverse);
        return (reverse == n);
    }

    static boolean isPalindrome(int n) {
        return (reverse(n));
    }
}

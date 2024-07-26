public class _7_1_Reverse_the_given_number {
    public static void main(String[] args) {
        int n = 10899;
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        System.out.print("\n" + reverse);
    }
}

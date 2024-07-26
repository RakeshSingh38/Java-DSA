public class _7_Print_the_reverse_of_a_number {
    public static void main(String[] args) {
        int n = 1323;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(" " + lastDigit);
            n = n / 10;
        }
    }
}

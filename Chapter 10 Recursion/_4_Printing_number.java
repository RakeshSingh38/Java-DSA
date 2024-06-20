public class _4_Printing_number {
    public static void main(String[] args) {
        int n = 10;
        //printingNumber(n);

        System.out.println(sumOfNumber(n));
    }

    @SuppressWarnings("unused")
    private static void printingNumber(int n) {
        if (n == 0)
            return;

        printingNumber(n - 1);
        System.out.println(n + " ");
    }

    static int sumOfNumber(int n) {
        if (n == 0)
            return 0;

        //return n * (n + 1) / 2;
        return n + sumOfNumber(n - 1);
    }
}

public class mainnnn {

    public static void main(String[] args) {
        printReverse(5);
    }

    private static void printReverse(int n) {
        if (n == 0) {
            return;
        }
        printReverse(n - 1);
        System.out.println(n);

    }
}

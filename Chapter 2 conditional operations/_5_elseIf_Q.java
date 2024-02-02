public class _5_elseIf_Q {
    public static void main(String[] args) {
        int a = 1, b = 20, c = 3;
        if (a >= b && a >= c) {
            System.out.println("Largest number is a");
        } else if (b >= c) {
            System.out.println("largest number is b");
        } else {
            System.out.println("Largest number is C");

        }
    }
}

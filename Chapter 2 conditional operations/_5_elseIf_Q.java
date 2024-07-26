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

        // or we can also right it as
        System.out.println(
                a >= b && a >= c ? "Largest number is a" : (b >= c ? "Largest number is b" : "Largest number is C"));
    }
}

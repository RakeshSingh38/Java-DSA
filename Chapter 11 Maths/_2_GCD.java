/**
 * _2_GCD
 */
public class _2_GCD {
    public static void main(String[] args) {
        //gcd(0, 8);
        int ans = recursiveGCD(34, 24);
        System.out.println(ans);
    }
    @SuppressWarnings("unused")

    private static void gcd(int a, int b) {
        if (a < 0)
            a = Math.abs(a);
        if (b < 0)
            b = Math.abs(b);

        System.out.println(a + " " + b);
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    static int recursiveGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0)
            return b;

        int temp = recursiveGCD(b % a, a);
        return temp;
    }
}
/**
 * _3_Checking_if_odd_or_not
 */
public class _3_Checking_if_odd_or_not {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isodd(n));
    }

    public static boolean isodd(int n) {
        return (n & 1) == 1;
    }
}
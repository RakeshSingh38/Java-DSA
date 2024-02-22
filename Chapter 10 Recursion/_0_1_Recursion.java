public class _0_1_Recursion {
    public static void main(String[] args) {
        // it wont go above 2 ^ 31 as its the maximum int value
        int ans = pow(2, 31);
        System.out.println(ans);
    }

    private static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = pow(a, n - 1);

        return temp * a;
    }
}

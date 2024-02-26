public class _2_Recursion_2 {
    public static void main(String[] args) {
        System.out.println(pow(2, 0));
    }

    private static int pow(int a, int n) {

        // this will handle 2^0 as 1 (no matter what a is )
        if (n == 0)         return 1;
        
        // this will handle 2^1 any thing raise to 1 should give a
        else if (n == 1)    return a;

        //int temp = pow(a, n - 1);

        return a * pow(a, n - 1);
    }
}

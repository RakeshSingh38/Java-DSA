public class _2_Recursion_2 {
    public static void main(String[] args) {
        //System.out.println(pow(2, 0));
        System.out.println(powOptimize(2.000, -2));
    }

    //    private static int pow(double a, int n) {
    //
    //        // this will handle 2^0 as 1 (no matter what 'a' is )
    //        if (n == 0)
    //            return 1;
    //
    //        // this will handle 2^1 any thing raise to 1 should give a
    //        else if (n == 1)
    //            return a;
    //
    //        //int temp = pow(a, n - 1);
    //
    //        return a * pow(a, n - 1);
    //    }

    private static double powOptimize(double a, int n) {

        // this will handle 2^0 as 1 (no matter what a is )
        if (n == 0)
            return 1;

        // this will handle 2^1 any thing raise to 1 should give a
        if (n == 1)
            return a;
        // tip      to convert a negative number to positive just multiply it by -1 ( it wont be used if no condtion is there to handle negative power
        //if (n < 0) {
        //    n = n * -1;
        //}

        // To handle case for negative power , integer lowest value is -2^31 so if n>0 and n<-31 then only execute this block for negative power
        if (n < 0 && n >= -31) {
            return 1 / powOptimize(a, -n);
        }
        double temp = powOptimize(a, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else
            return temp * temp * a;
    }
}

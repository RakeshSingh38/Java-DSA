public class _2_9 {

    // leetcode Q 69 sqrt(x)
    public static void main(String[] args) {
        int x = 8;
        //double find = find(x);
        //System.out.println(find);

        int result = find2(x);
        System.out.println(result);
    }

    static double find(int x) {
        int max = (int) Math.sqrt(x);
        System.out.println(max);
        int i = (int) Math.floor(max);
        System.out.println(i);

        return x;
    }

    /**
     * Finds the square root of a given number using binary search algorithm.
     * 
     * @param x the number for which square root needs to be found
     * @return the square root of the given number
     */
    static int find2(int x) {
        int start = 1;
        int end = (x / 2) + 1;
        int sqrt = 0;
        double mid = 0;
        while (start <= end) {
            //int mid = (start + end) / 2;
            // below line is to avoid overflow
            mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                start = (int) mid + 1;
                sqrt = (int) mid;
            } else {
                end = (int) mid - 1;
            }
        }
        //return -1;

        return sqrt;
    }
}

/* 
        int start = 0;
        int end = (x/2)+1;
        int sqrt = 0;
        double mid= 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid*mid  == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                start =(int) mid + 1;
                sqrt =(int) mid;
            } else {
                end = (int)mid - 1;
            }
        }
        //return -1;

        return sqrt;
 */

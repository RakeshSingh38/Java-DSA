import java.util.Arrays;

public class _10_Prefix_sum {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 6, -2, 7 };
        int[] sum = prefixSum(arr, arr.length);
        System.out.println("Brute forch approach is ");
        System.out.println(Arrays.toString(sum));

        System.out.println("\nOptimal approach is ✅✅");
        int[] optimal = prefixSumOptimal(arr);
0        System.out.println(Arrays.toString(optimal) + "\n");
    }

    // ->   i took 3 things such as array and size
    private static int[] prefixSum(int[] arr, int n) {
        //             ↑
        // took an array which i will use to return it as function is of type array
        int[] pf = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            /* imp      its same as sum of array only addition is i am using an arary to store
                        the contents of the array*/
            for (int j = 0; j <= i; j++) {
                sum = sum + arr[j];
            }
            /*  once i get the sum i will update the pf of i using the values of sum
            whenever the inner loop is broke it will take and update the value      */
            pf[i] = sum;
            //System.out.println(sum);
        }
        return pf;
    }

    static int[] prefixSumOptimal(int[] arr) {
        int n = arr.length;
        int[] pf = new int[n];
        pf[0] = arr[0];
        // above can be removed if used tip comment and return arr;
        for (int i = 1; i < n; i++) {
            // 
            pf[i] = pf[i - 1] + arr[i];

            // tip      for simplicity 
            //arr[i] = arr[i - 1] + arr[i];
        }
        //return arr;
        return pf;
    }
}

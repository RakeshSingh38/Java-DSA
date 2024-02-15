public class _4_find_max_min {
    public static void main(String[] args) {
        int[] arr = { -2, 0, -1 };

        //printArray(arr);

        //System.out.println("Minimum number is " + findMinimum(arr));
        //System.out.println("Minimum number is " + solve(arr));
        int ans = solve(arr);
        System.err.println(ans);
        //printArray(arr);
    }

    static int findMinimum(int[] arr) {
        int min = arr[0];

        // for maximum

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                // for maximum
                //if (arr[i] > max) {

                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //System.out.println(min);

        // i need to print it so i will use sop in main function
        //System.out.println(max);
        return min + max;
    }

    // for maximum
    static int solve(int[] A) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (i < min) {
                min = A[i];
            }

            if (i > max) {
                max = A[i];
            }
        }
        int ans = A[min] + A[max];
        if (A.length <= 0) {
            return 0;
        }
        return ans;
    }

}

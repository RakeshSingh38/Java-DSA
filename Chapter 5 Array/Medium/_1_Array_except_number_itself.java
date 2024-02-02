import java.util.Arrays;

/**
 * _1_Array_except_number_itself
 */
public class _1_Array_except_number_itself {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] ans = numberItself(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] numberItself(int[] arr) {
        // Product of array except self
        // https://leetcode.com/problems/product-of-array-except-self/
        int[] ans = new int[arr.length];
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = 1;
        right[arr.length - 1] = 1;
        System.out.println(right[arr.length - 1]);
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}

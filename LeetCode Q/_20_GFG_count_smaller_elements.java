import java.util.*;
//import java.util.HashMap;
//import java.util.Map;

// GFG problem: Count smaller elements or smaller elements on right side
// Given an array arr[] of N integers, the task is to find the count of elements on the right of each element in the array which are smaller than the current element.

// Time complexity: O(N log N) , space complexity: O(N)
public class _20_GFG_count_smaller_elements {
    public static void main(String[] args) {
        int[] arr = { 12, 1, 2, 3, 0, 11, 4 };
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(constructLowerArray(arr)));
    }

    public static int[] constructLowerArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int[] sortedArr = Arrays.copyOf(arr, n);
        Arrays.sort(sortedArr);
        int[] bit = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            int pos = Arrays.binarySearch(sortedArr, arr[i]);
            ans[i] = query(bit, pos);
            update(bit, pos + 1, 1);
        }

        return ans;
    }

    private static void update(int[] bit, int index, int value) {
        while (index < bit.length) {
            bit[index] += value;
            index += index & -index;
        }
    }

    private static int query(int[] bit, int index) {
        int sum = 0;
        while (index > 0) {
            sum += bit[index];
            index -= index & -index;
        }
        return sum;
    }
}

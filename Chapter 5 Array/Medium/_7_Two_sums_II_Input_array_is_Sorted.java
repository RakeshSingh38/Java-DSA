import java.util.Arrays;
// Leeetcode 167 Two Sum II - Input array is sorted
public class _7_Two_sums_II_Input_array_is_Sorted {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        //System.out.println(Arrays.toString(twoSum(arr, target)));
        twoSum(arr, target);

        int[] ans = findingBinarySearch(arr, target);
        System.out.println(Arrays.toString(ans));

        /* 
        The basic idea is that:
        
        If our current sum is too small, move closer to the right.
        If our current sum is too large, move closer to the left.
        
        // imp      
        In an interview, whenever you're given a question where the input array is sorted, here are some super useful things to consider:
        
        1 > Binary Search
        2 > Two (or three) pointers
        3 > A sliding window
        4 > Traversing from the right
        
        
         */
    }

    private static int[] twoSum(int[] arr, int target) {
        //int index = 1;
        //for (int i = 1; i < numbers.length; i++) {
        //    if (numbers[i - 1] == target) {
        //        numbers[index] = numbers[i];
        //        index++;
        //        return new int[] { index };
        //    }
        //}
        //return null;
        //for (int i = 1; i < arr.length; i++) {
        //    for (int j = i - 1; j < arr.length; j++) {
        //        if (arr[i] + arr[j] == target) {
        //            int remaining = target - arr[i];
        //            if (remaining == arr[i]) {
        //                return new int[] { i, j };
        //            }
        //            //target = arr[j - 1] + arr[i];
        //        }
        //    }
        //}
        return new int[] { -1, -1 };
    }

    static int[] findingBinarySearch(int[] arr, int target) {
        //int start = 0;
        //int end = arr.length - 1;
        //while (start <= end) {
        //    int sum = arr[start] + arr[end];
        //    if (sum == target) {
        //        return new int[] { start + 1, end + 1 };
        //    } else if (target > sum) {
        //        start++;
        //    } else {
        //        end--;
        //    }
        //}
        //return new int[] { -1, -1 };
        // shorter version
        int start = 0, end = arr.length - 1;
        while (arr[start] + arr[end] != target)
            if (arr[start] + arr[end] < target) start++;
            else end--;

        return new int[] { start + 1, end + 1 };
    }
}
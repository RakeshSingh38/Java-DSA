import java.util.Arrays;

public class _10_Next_permutation {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 }; // 1 3 2
        int[] arr = { 3, 2, 1 }; // 1 2 3
        int[] arr2 = { 1, 1, 5 }; // 1 5 1
        nextPermutation2(arr1);
        nextPermutation2(arr);
        nextPermutation2(arr2);
        System.out.println();
        nextPermutation(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    private static void nextPermutation(int[] arr) {
        int start = 1;
        int end = arr.length - 1;
        //int res = arr.length * 2;
        //System.out.println(res);
        //if (res > 0) {
        Arrays.sort(arr);
        while (start <= end) {
            if (arr[start] <= arr[end] && start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        //res--;
        //}
        //}
    }

    public static void nextPermutation2(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);

    }

    private static void reverse(int[] nums, int i) {
        int start = i;
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

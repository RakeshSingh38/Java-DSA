import java.util.Arrays;

public class _10_Squares_of_a_sorted_array {
    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        int[] ans = sqrsSortedArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sqrsSortedArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] *= nums[i];
        }
        //sort(nums);
        // tip      better use hashmap or use Arrays.sort();
        Arrays.sort(nums);
        return nums;
    }

    static void sort(int[] arr) {
        // worst TC if used this
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
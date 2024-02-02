//import java.util.Arrays;

import java.util.Arrays;

public class _4_first_last_position {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        //int ans[] = range(nums, target);
        //int ans = first(nums, target);
        //System.out.println(ans);
        //System.out.println(first(nums, target));
        int ans[] = range(nums, target);
        System.out.println((Arrays.toString(ans)));
    }

    static int[] range(int[] nums, int target) {
        //int[] ans = new int[2];
        //int[] ans = { -1, -1 };
        int first = first(nums, target);
        int last = last(nums, target);
        return new int[] { first, last };
    }

    static int first(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                // look in the left array
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            //} else {
            //    ans = mid;
            //}
        }
        System.out.println(ans);
        return ans;
    }

    private static int last(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                // look in the right array
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            //} else {
            //    ans = mid;
            //}
        }
        System.out.println(ans);
        return ans;
    }
}
// LeetCode Q 1 two sum 

import java.util.*;
//import java.util.Map.*;

public class _7_Two_sum {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4 };
        // returning index 
        int[] ans = twoSums1(arr, 6);
        System.out.println(Arrays.toString(ans));

        // returning values
        int[] res = twoSums3(arr, 6);
        System.out.println(Arrays.toString(res));
    }

    // imp       Time complexity = O(n)
    // Space complexity = O(n)
    static int[] twoSums1(int[] nums, int target) {
        // ->       One pass HashMap approach ( hashmap approach )
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans)) {
                return new int[] { map.get(ans), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };

        // imp     here we will find differene of target and nums[i] and store it in map
        //         if the difference is already present in map then we will return the index of that difference and i

        // ->       Two pass HashMap approach
        /* Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums    [i],        i);
            //               ↑          ↑ 
            //             Key and its value
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[] { i, map.get(target - nums[i]) };
            }
        }
        return null;*/
    }

    //    private static int twoSum2(int[] arr, int target) {
    //        int sum = 0;
    //        for (int i = 0; i < arr.length; i++) {
    //            for (int j = i - 1; j < arr.length; j++) {
    //                if (sum != target) {
    //                    sum += arr[i];
    //                    //System.out.println(" " + sum);
    //                    if (sum == target) {
    //                        System.out.println(" " + arr[i] + " " + arr[j]);
    //
    //                    }
    //
    //                }
    //            }
    //        }
    //        return -1;
    //    }

    public static int[] twoSums3(int[] arr, int target) {
        //         tc = O(n^2)
        //         sc = O(1)
        // i have to use (arr[i] + arr[j] ==target)
        //for (int i = 0; i < arr.length; i++) {
        //    for (int j = i + 1; j < arr.length; j++) {
        //        if (arr[i] + arr[j] == target) {
        //            System.out.println(" " + arr[i] + " " + arr[j]);
        //            return new int[]{i, j};
        //        }
        //    }
        //}

        // imp      Time complexity = O(n^2)
        // Space complexity = O(1)

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    //System.out.println("" + arr[i] + " " + arr[j]);
                    return new int[] { arr[i], arr[j] };
                }
            }
        }
        return new int[] { -1, -1 };

    }

    static int[] twoSum4(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ans = nums.length;
            if (map.containsKey(ans)) {
                return new int[] { i, i + 1 };
            }
        }
        return new int[] { -1, -1 };
    }
}

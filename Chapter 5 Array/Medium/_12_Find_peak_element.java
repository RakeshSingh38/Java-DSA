//import java.util.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// Leetcode Q 162 Find Peak Element ( medium ) 
// Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -∞.
// You must write an algorithm that runs in O(log n) time.
// Example 1:
// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index number 2.

public class _12_Find_peak_element {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 }; // 2
        int[] arr2 = { 1, 2, 1, 3, 5, 6, 4 }; // 5
        int[] arr3 = { 1, 2 }; // 5
        System.out.println("\nUsing Binary Search\n");
        System.out.println(findPeakElement(arr));
        System.out.println(findPeakElement(arr2));
        System.out.println(findPeakElement(arr3));
        System.out.print("\nUsing Arrays\n");
        System.out.println(findPeakElementUsingArrays(arr));
        System.out.println(findPeakElementUsingArrays(arr2));
        System.out.println(findPeakElementUsingArrays(arr3));
        System.out.println("\nUsing Hashmaps\n");
        System.out.println(findPeakElementUsingHashmaps(arr));
        System.out.println(findPeakElementUsingHashmaps(arr2));
        System.out.println(findPeakElementUsingHashmaps(arr3));
    }

    // using binary search ( efficient ) ✅✅ ( 0ms ) TC = O(logn) SC = O(1)
    private static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // imp      using normal for loop ( very efficient )  ✅✅ ( 0ms ) TC = O(n) SC = O(1)
    static int findPeakElementUsingArrays(int[] arr) {
        int index = 0;
        int target = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (target <= arr[i]) {
                target = arr[i];
                index = i;
            }
        }
        return index;
    }

    // imp         using hashmap   ( not much efficient ) ✅✅ ( 1ms ) TC = O(n) SC = O(n)
    static int findPeakElementUsingHashmaps(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }
        Arrays.sort(arr);
        return map.get(arr[n - 1]);
    }
}

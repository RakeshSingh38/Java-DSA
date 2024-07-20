import java.util.Arrays;
// LeetCode Q   1979 |  Easy   | Find Greatest Common Divisor of Array
// Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

// The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

public class _3_GCD_leetcode_sum {
    public static void main(String[] args) {
        int[] arr = { 2,5,6,9,10 };
        int ans = findGCDLeetCode(arr);
        System.out.println(ans); // Output should be 1 for the given input
    }

    public static int findGCDLeetCode(int[] arr) {
        Arrays.sort(arr);
        int start = 0;
        int n = arr[0];
        int end = arr[arr.length - 1];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && end % i == 0)
                start = i;
        }
        return start;
    }

    public static int findGCD2(int[] arr) {
        Arrays.sort(arr);
        int start = 0;
        int n = arr[0]; // Initialize n with a default value
        int end = arr[arr.length - 1]; // Initialize end with a default value
        for (int i = 1; i <= arr.length; i++) {
            if (n % i == 0 && end % i == 0)
                start = i;
        }
        return start;
    }

    public static int findGCD(int[] arr) {
        int ans = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            ans = recursiveGCD(ans, Math.abs(arr[i]));
        }
        return ans;
    }

    static int recursiveGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0)
            return a;

        return recursiveGCD(b, a % b); // Corrected order of arguments
    }
}

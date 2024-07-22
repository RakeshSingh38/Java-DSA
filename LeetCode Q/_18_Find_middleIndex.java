//import java.util.Arrays;

// tip          need a basic understanding of prefix sum and Leetcode Q 724 Find Pivot Index

// Q    Leetcode 1991 Find the Middle Index in Array - Easy
// Link https://leetcode.com/problems/find-the-middle-index-in-array/

// Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

public class _18_Find_middleIndex {
    public static void main(String[] args) {
        int[] arr = { -1, -1, 4 };
        System.out.println(findMiddleIndex(arr));
    }

    public static int findMiddleIndex(int[] arr) {
        int left = 0, sums = 0;
        for (int i = 0; i < arr.length; i++)
            sums += arr[i];

        System.out.println(sums);
        for (int i = 0; i < arr.length; i++) {
            sums -= arr[i];
            if (left == sums) {
                return i;
            }

            left += arr[i];

        }
        return -1;
    }
}

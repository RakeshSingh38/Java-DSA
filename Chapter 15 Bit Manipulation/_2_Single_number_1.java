import java.util.Arrays;
// Leetcode Q - 136 Single Number
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// ex 1:
// Input: nums = [2,2,1]
// Output: 1

public class _2_Single_number_1 {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        // imp      Associatve rule : Order doesn't matter 
        // because XOR is commutative and associative 
        // Commutative : a ^ b = b ^ a      
        System.out.println(singleNumber(arr));
    }

    static int singleNumber(int[] nums) {
        //Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        // without above steps still the same output as XOR is commutative and associative
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            unique ^= nums[i];
        }
        return unique;
    }
}

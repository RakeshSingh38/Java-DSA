import java.util.Arrays;

public class _10_Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 ,4};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
        //  i sorted the array so that i can reduce the chances of Time limit exceeded
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            // compared with previous if its same return true else i will return false
            if (nums[i] == nums[i - 1]) {
                System.out.println(nums[i - 1]);
                return true;
            }
        }
        return false;
    }
    /* 
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
     */

    /* 
        public boolean containsDuplicate(int[] nums) {
        //  i sorted the array so that i can reduce the chances of Time limit exceeded
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            // compared with previous if its same return true else i will return false
                if (nums[i] == nums[i-1]) {
                    return true;
                }
            }
        return false;
    }
      */
}

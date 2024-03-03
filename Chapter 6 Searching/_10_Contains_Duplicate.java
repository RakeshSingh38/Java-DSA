import java.util.Arrays;

public class _10_Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 6 };
        System.out.println("Length of array is " + nums.length);
        System.out.println(nums[nums.length - 3]);
        System.out.println(nums.length - 1 + " nnnnnn");
        System.out.println(nums.length - 2);

        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
        //  i sorted the array so that i can reduce the chances of Time limit exceeded
        Arrays.sort(nums);                         //  0 <  5  
        // r      if there are 2 loops then nums will be i < nums.kength-1 as we are comparing with i+1 , j will take care of last index so we wont go till last index instead we will go till nums.length-1
        //        so if i < nums.length then i+1 will be out of bound
        for (int i = 1; i < nums.length; i++) {
            // compared with previous if its same return true else i will return false
            if (nums[i] == nums[i - 1]) {
                //System.out.println(nums[i - 1]);
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

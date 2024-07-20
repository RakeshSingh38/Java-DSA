//import java.util.ArrayList;
// LeetCode Q 27 Remove Element
public class _8_Remove_element {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 3, 5, 4, 5 };
        int result = removeELement(arr, 2);
        System.out.println(result);

    }

    public static int removeELement(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // if value of arr[i] is not equal to val then we will store the value of arr[i] in arr[count]
            // then we will increment the count and return it
            if (arr[i] != val) {
                arr[count] = arr[i];
                count++;
            }
        }
        arr = null;
        return count;
    }
    // for reference
    /* 
    public: int removeElement(std::vector < int > & nums, int val) {
        int j = 0;
        for(int i: nums)
        if(i != val) nums[j++] = i;
        return j;
    }
     */
}

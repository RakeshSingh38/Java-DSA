import java.util.Arrays;

public class _8_Sort_array {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    static int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}

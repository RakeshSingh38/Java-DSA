import java.util.Arrays;

public class _11_reference_value {

    public static void main(String[] args) {
        // creating an array
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        changeValue(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changeValue(int[] nums) {
        nums[0] = 55;
        // r     here we are changing the value via ref variable so the same variable is gonna change 

    }

}
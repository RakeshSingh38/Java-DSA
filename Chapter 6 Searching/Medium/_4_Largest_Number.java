import java.util.Arrays;

public class _4_Largest_Number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        _4_Largest_Number obj = new _4_Largest_Number();
        obj.largestNumber(arr);
    }

    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = String.valueOf(nums[i]);
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : arr)
            sb.append(s);
        return sb.toString();
    }
}

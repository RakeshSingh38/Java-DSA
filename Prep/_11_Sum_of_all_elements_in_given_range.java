
public class _11_Sum_of_all_elements_in_given_range {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 6, -2, 7 };
        sumInGivenRange(arr, 0, 4);
    }

    private static void sumInGivenRange(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

public class _5_maxRange {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 54, 4, 5, 3, 2, 3, 59, 5 };
        int max = maxRange(arr, 1, 9);
        //maxRange(arr, 1, 3);
        System.out.println(max);

    }

    public static int maxRange(int[] arr, int start, int end) {
        int max = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                //      59 is store in max and returned
            }
        }
        return max;
    }
}

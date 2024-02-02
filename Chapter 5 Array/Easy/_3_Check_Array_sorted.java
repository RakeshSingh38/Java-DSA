public class _3_Check_Array_sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int N = arr.length-1;
        System.out.println(checkSorted(arr, N));
    }

    private static int checkSorted(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i + 1] >= arr[i]) {
                count++;
            }
            if (count >= n) {
                return 1;
            }
        }
        return 0;
    }
    /* 
        boolean isSorted = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                return 0;
            }
        }
        return 1;
     */
}

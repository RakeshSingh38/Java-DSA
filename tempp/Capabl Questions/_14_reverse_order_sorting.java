import java.util.Arrays;

public class _14_reverse_order_sorting {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 1, 8, 2 };
        int N = arr.length;
        reverseSort(arr, N);
    }

    static void reverseSort(int[] arr, int N) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

import java.util.Arrays;

public class _2_Bubble_sort {
    public static void main(String[] args) {

        int[] arr = { 5, 3, 2, 1, 6, 8, 4 };
        //System.out.println(Arrays.toString(bubbbleSort(arr))); // ✅
        System.out.println(Arrays.toString(bubbleSort1Pass(arr)));
    }

    static int[] bubbbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    // test     not working
    static int[] bubbleSort1Pass(int[] arr) {
        //for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length-1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                //}
            }
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}

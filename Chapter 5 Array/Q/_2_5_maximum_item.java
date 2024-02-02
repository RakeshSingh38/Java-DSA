import java.util.Arrays;

public class _2_5_maximum_item {

    public static void main(String[] args) {
        int[] arr = { 9, 3, 4, 54, 1, 6, 45 };
        System.out.print("Maximum value is ");
        System.out.println(max(arr));

        System.out.print("Maximum RANGE is ");
        // throw;
        System.out.println(maxRange(arr, 0, 2));
        System.out.print("Minimum range is ");
        System.out.println(minRange(arr, 0, 6));
        // fix    make sure u write the correct syntax else error
        reverse(arr);
        System.out.print("Reverse is ");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        // see          its working right arr is modified many times
        swap(arr, 0, 6);
        System.out.println("swap is ");
        System.out.println(Arrays.toString(arr));

    }

    static int max(int[] arr) {
        // int[] arr = { 9, 3, 4, 54, 1, 6, 45 };

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr, int start, int end) {
        // int[] arr = { 9, 3, 4, 54, 1, 6, 45 };

        int maxRange = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxRange) {

                maxRange = arr[i];
            }
        }
        return maxRange;
    }

    static int minRange(int[] arr, int start, int end) {
        // int[] arr = { 9, 3, 4, 54, 1, 6, 45 };

        // r         we can,t set it as 0 as according to it answer will be always 0
        //                 |      so best is to make it 0th index value
        //                 ↓

        int minRange = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] < minRange) {

                minRange = arr[i];
            }
        }
        return minRange;
    }

    static void swap(int[] arr, int index1, int index2) {
        // int[] arr = { 9, 3, 4, 54, 1, 6, 45 };

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // imp      tip : also known as two pointer method
    static void reverse(int[] arr) {
        // int[] arr = { 9, 3, 4, 54, 1, 6, 45 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}

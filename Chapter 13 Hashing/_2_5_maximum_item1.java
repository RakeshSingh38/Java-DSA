import java.util.Arrays;

public class _2_5_maximum_item1 {

    public static void main(String[] args) {
        int[] arr = { 9, 3, 4, 54, 1, 6, 45 };
        System.out.print("Maximum value is ");
        System.out.println(max(arr));

        System.out.print("Maximum Range is ");
        String java = "string";
        System.out.println(java);
        System.out.println(maxRange(arr, 0, 2));
        System.out.print("Minimum range is ");
        System.out.println(minRange(arr, 0, 6));

        // fix   make sure u write the correct syntax else error
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int max(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr, int start, int end) {

        int maxRange = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxRange) {

                maxRange = arr[i];
            }
        }
        return maxRange;
    }

    static int minRange(int[] arr, int start, int end) {

        int minRange = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] < minRange) {

                minRange = arr[i];
            }
        }
        return minRange;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // imp     tip : also known as two pointer method 
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}

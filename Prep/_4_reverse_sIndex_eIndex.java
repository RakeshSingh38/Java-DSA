import java.util.Arrays;

public class _4_reverse_sIndex_eIndex {
    public static void main(String[] args) {

        System.out.println(" 0  1  2  3  4  5  6  7  8  9 ");

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(arr));
        System.out.println("\n\n");
        reverse(arr, 3, 7);
        System.out.println(" 0  1  2  3  4  5  6  7  8  9 ");
        // imp     we can also use java.util.Arrays.toString(arr)
        //System.out.println(java.util.Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

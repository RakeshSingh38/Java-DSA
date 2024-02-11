import java.util.Arrays;

// Reverse an array

public class _2_reverseArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println("0    1    2   3   4   5   6   7   8   9 ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        reverse(arr);
        System.out.println("0    1    2   3   4   5   6   7   8   9 ");
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int startPoint = 0;
        int endPoint = arr.length - 1;

        // if i write startPoint <= endPoint, then it will swap the middle element with itself
        // and
        // if i write startPoint != endPoint, then it will work with odd length array but not with even length array
        // as i will get index out of bound exception as
                while (startPoint < endPoint) {
                    int temp = arr[startPoint];
                    arr[startPoint] = arr[endPoint];
                    arr[endPoint] = temp;
        
                    // increment start and decrement end
                    startPoint++;
                    endPoint--;
                }

        // imp      for loop
        /* for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/
    }
}

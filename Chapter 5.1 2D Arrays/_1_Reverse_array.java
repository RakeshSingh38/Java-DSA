import java.util.Arrays;

public class _1_Reverse_array {
    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 1 };
        System.out.println("\nOriginal Array");
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        System.out.println("\nNew Array");
        // tip    to print an array from right to left
        //  what we are doing is initializing the value from last i.e arr.length-1
        //  then we are making infinite loop but only if i is >= 0 and decreasing the value of i
        for (int i = n - 1; i >= 0; i--) {
            //System.out.print(Integer.toString(arr[i]) + " ");

            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

    }
}

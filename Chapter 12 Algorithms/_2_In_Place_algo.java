// imp      In place algo example

public class _2_In_Place_algo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 ,9,0};
        int n = arr.length;
        System.out.println();
        System.out.println("Original array is");
        printArray(arr, n);
        System.out.println("\nReversed array is");
        reverseArray(arr, n);
        printArray(arr, n);
        System.out.println();
    }

    public static void reverseArray(int[] arr,
            int n) {
        // Create a copy array
        // and store reversed
        // elements
        /* int[] rev = new int[n];
        for (int i = 0; i < n; i++)
            rev[n - i - 1] = arr[i];*/
        n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        // Now copy reversed 
        // elements back to arr[]
        /* for (int i = 0; i < n; i++)
            arr[i] = rev[i];*/
    }

    /* Utility function to
    print an array */
    public static void printArray(int[] arr,
            int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}

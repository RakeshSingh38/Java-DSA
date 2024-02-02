public class _2_8_findMinimum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 23, 1, 6 };

        //printArray(arr);

        System.out.println("Minimum number is " + findMinimum(arr));

        //printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }

    static int findMinimum(int[] arr) {
        int min = arr[0];

        // for maximum
        //int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                // for maximum
                //if (arr[i] > max) {

                min = arr[i];
            }
        }
        //System.out.println(min);

        // i need to print it so i will use sop in main function
        return min;
    }

}

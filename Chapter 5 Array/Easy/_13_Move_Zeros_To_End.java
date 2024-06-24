// Leetcode Q  #283  Move Zeroes Easy
// https://leetcode.com/problems/move-zeroes/  

public class _13_Move_Zeros_To_End {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZerosToEnd(arr);
        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int j = 0; // Pointer to place the next non-zero element

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap elements at i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
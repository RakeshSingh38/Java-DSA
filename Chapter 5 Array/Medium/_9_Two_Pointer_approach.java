//import java.util.Arrays;

// imp       program to print numbers from start and end using two pointers

public class _9_Two_Pointer_approach {
    public static void main(String[] args) {
        //int[] numbers = { 3, 2, 4, 1 };
        int[] numbers1 = { 3, 2, 4, 1, 5, 9, 8 };
        System.out.println();
        twoPointers(numbers1);
        //printNumbersFromStartToEnd(numbers1);
    }

    private static void twoPointers(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        //Arrays.sort(arr);
        while (start <= end) {
            System.out.print(arr[start] + " ");
            start++;
            // middle element is repeated twice so write this condition
            // so that once start and end are same , start will not be printed again as above i incremented start by 1
            // so start is 4 and end is 3 as it is decremented by 1
            // 4 <=3 ❌
            if (start <= end) {
                System.out.print(arr[end] + " ");
                end--;
            }
        }
    }

    // two pointers program to print numbers from start and end
    // 3 1 2 4
    // 3 4 2 1
    public static void printNumbersFromStartToEnd(int[] arr) {
        int start = 0, end = arr.length - 1; // 5
        //Arrays.sort(arr);
        while (start <= end) {
            System.out.print(arr[start] + " ");
            start++;
            //System.out.print(arr[end] + " ");
            // middle element is repeated twice so write this condition
            if (start <= end) {
                System.out.print(arr[end] + " ");
                end--;
            }

            //System.out.println();
        }
    }
}

import java.util.Arrays;

// tip    celing means smallest greater number than target

public class _4_2_Celing_Binary_search {

    public static void main(String[] args) {
        int[] arr = { 23, 5, 6, 12, 67, 65 };
        Arrays.sort(arr);
        int target = 4;
        System.out.println();
        System.out.println("Index found at " + ceiling_BinarySearch(arr, target) + " and target is " + target);
        printList(arr);
        System.out.println("| |  |  |  |  |");
        System.out.println("0 1  2  3  4  5");
        System.out.println();
    }

    static int ceiling_BinarySearch(int[] arr, int target) {

        //what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //int mid = (start + end) / 2;
            // below line is to avoid overflow
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        //return -1;  ❌❌
        //start = end + 1;
        return start; //  ✅✅✅
    }

    public static void printList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

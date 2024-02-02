import java.util.Arrays;

// tip    floor means greatest number smaller or equal to target

public class _4_3_Floor_Binary_search {
    // binary search requires sorted array
    // Eg : dictionary its an sorted way to describe words
    // we go alphabatically

    //import java.util.Arrays;

    public static void main(String[] args) {
        int[] arr = { 23, 5, 6, 12, 67, 65 };
        Arrays.sort(arr);
        System.out.println();
        int target = 7;
        System.out.println("Index found at " + floor_BinarySearch(arr, target) + " and target is " + target);
        printList(arr);
        System.out.println("| |  |  |  |  |");
        System.out.println("0 1  2  3  4  5");
        System.out.println();
    }

    static int floor_BinarySearch(int[] arr, int target) {
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
        return end; //  ✅✅✅
    }

    public static void printList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

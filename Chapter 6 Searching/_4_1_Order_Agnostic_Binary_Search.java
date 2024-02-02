// binary search requires sorted array
// Eg : dictionary its an sorted way to describe words
// we go alphabatically

public class _4_1_Order_Agnostic_Binary_Search {

    public static void main(String[] args) {
        //int[] arr = { 23, 5, 6, 12, 67, 65 };
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 109 };
        //System.out.println(Arrays.toString(arr));
        System.out.println("Index found at " + OrderAgnostic_BinarySearch(arr, -12));
        printList(arr);
    }

    static int OrderAgnostic_BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        // r        same as above

        //if(arr[start] < arr[end]){
        //    isAsc= true;
        //}
        //else{
        //    isAsc = false;
        //}

        while (start <= end) {
            //int mid = (start + end) / 2;
            // below line is to avoid overflow
            int mid = start + (end - start) / 2;

            // condition for ascending order
            if (arr[mid] == target) {
                return mid;
            }
            // target = -12
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            //if (arr[mid] == target) {
            //    return mid;
            //} else if (arr[mid] < target) {
            //    start = mid + 1;
            //} else {
            //    end = mid - 1;
            //}
        }
        return -1;
    }

    public static void printList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}

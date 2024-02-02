public class _6_Sort_colors {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0 };
        int n = arr.length;
        System.out.println();
        System.out.println("Original array is");
        printArray(arr, n);
        System.out.println();
        System.out.println("\nSorted array is");
        sortColors(arr, n);
        printArray(arr, n);
        System.out.println();
        System.out.println();
    }

    // imp     Dutch National Flag Algorithm
    public static void sortColors(int[] nums, int n) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    // explain Dutch National Flag Algorithm
    // https://www.youtube.com/watch?v=uvB-Ns_TVis
    // https://www.youtube.com/watch?v=BOt1DAvR0zI
    // https://www.youtube.com/watch?v=oaVa-9wmpns
    // https://www.youtube.com/watch?v=uvB-Ns_TVis

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    // imp      Bruteforce 
    //private static void sortColors(int[] arr, int n) {
    //    n = arr.length;
    //    for (int i = 0; i < n; i++) {
    //        for (int j = i + 1; j < arr.length; j++) {
    //            int temp = arr[i];
    //            if (arr[i] > arr[j]) {
    //                //arr[i] = arr[n - i - 1];
    //                arr[i] = arr[j];
    //                arr[j] = temp;
    //                //arr[n - i - 1] = temp;
    //            }
    //        }
    //    }
    //}

    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class _28_Single_element_in_a_sorted_array {

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 10 };

        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] arr) {

        // Optimzed Approach

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // if odd
            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    low = mid + 2;
                } else {
                    high = mid;
                }
            } else {
                if (arr[mid] == arr[mid - 1]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
        }
        return arr[low];
    }

    // Brute force
    /*
    // int max = Math.sqrt(nums);
    int unique = 0;
    for(int i=0;i<arr.length;i++){
    unique = unique^arr[i];
    }
    return unique;
    }
    */
}

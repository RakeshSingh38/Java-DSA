public class _5_Linear_Search {
    public static void main(String[] args) {
        int[] nums = {1, 2,0, 4, 3, 44, 51, 43, 344};
        int target = 51;

        int ans = linearSearch(nums, target);
        System.out.println("Index found at " + ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        // running loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // r   This line will execute if match is not found in index
        // i tried to " return target " it will just repeat itself so better
        // stick will return -1
        return Integer.MAX_VALUE;
    }
}

public class _1_linear_search_algo {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 3, 44, 51, 43, 344 };
        int target = 51;

        System.out.println();

        // 1> we pass array 1st
        // 2> then we pass the target or u can specify yourself using input scanner

        int ans = linearSearch(nums, target);
        System.out.println("Linear Search 1 :  Index found at " + ans);

        System.out.println();

        int ans2 = linearSearch2(nums, target);
        System.out.println("Linear Search 2 : Index found at " + ans2);

        boolean ans3 = linearSearch3(nums, target);
        System.out.println("Linear Search 3 : Index found at " + ans3);
    }

    // imp       search in the array: return if index is found
    // otherwise return -1 if not found

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

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // running loop
        for (int index : arr) {
                System.out.println(" "+index);

            if (index == target) return index;

        }
        // r     This line will execute if match is not found in index
        // i tried to " return Integer.MAX_VALUE " it's a constant which gives highest
        // integer
        // stick will return -1
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr, int target) {
        // running loop
        for (int index : arr) {
            if (index == target) {
                return true;
            }
        }
        // r    This line will execute if match is not found in index
        // i tried to " return target " it will just repeat itself so better
        // stick will return false
        return false;
    }
}

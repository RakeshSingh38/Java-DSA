public class _14_find_max_num_in_2d_array {

    // r        to find max array Length and sum of max length of arrays in 2D array

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 1 }, { 1, 2, 3, 4, 5, 10 } };

        System.out.println(maxLength(arr));
        System.out.println();
        System.out.println(findMaxSum(arr) + " final sum");
    }

    public static int findMaxSum(int[][] arr) {
        int maxSum = 0;
        int tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tempSum += arr[i][j];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
            System.out.println(tempSum);
            tempSum = 0; // Reset tempSum for the next array
        }
        return maxSum;
    }

    public static int maxLength(int[][] arr) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > maxLength) {
                maxLength = arr[i].length;
            }
        }
        return maxLength;
    }

}
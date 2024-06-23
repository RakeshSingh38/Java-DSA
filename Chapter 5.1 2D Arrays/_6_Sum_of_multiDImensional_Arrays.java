import java.util.*;

/**
 * _12_Sum_of_multiDImensional_Arrays
 */
public class _6_Sum_of_multiDImensional_Arrays {

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 1, 2, 3 } };
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                /* tip   
                with these syntax i can combine arrays of 2D array into 1D array
                arr.add(arr1[i][j]); // [1, 2, 3, 1, 2, 3]
                 */
                arr.add(arr1[i][j]);

                //sum = sum + arr1[i][j]; // 12
            }
        }
        System.out.println(arr);
        //System.out.println(sum);

        System.out.println(sum(arr1));
        System.out.println(sumUsingCollections(arr1));

    }

    // r     traditional way 
    static int sum(int[][] arr) {
        // edge cases
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Initialize sum to 0
        int sum = 0;

        // i capped the length of the array to avoid repeatedly accessing the length property.
        int rows = arr.length;

        // Iterate over each row of the 2D array
        for (int i = 0; i < rows; i++) {
            // Iterate over each element in the current row
            for (int j = 0; j < arr[i].length; j++) {
                // Add the current element to the sum
                sum += arr[i][j]; // 12
            }
        }
        // Return the total sum
        return sum;

    }

    /* r         using Collections */

    // this works too what it does is it takes the 2D array and convert it into 1D array and then sum it up

    static int sumUsingCollections(int[][] arr) {
        return Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .sum();
    }
}
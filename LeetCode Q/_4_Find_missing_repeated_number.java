// Leetcode problem 2965. Find Missing And Repeating values

/*
Time complexity: O(N^2) where N is the size of the grid (assuming the grid is square). 
The code involves nested loops to traverse the entire grid.

Space complexity: O(1) (Extra Space) since the HashSet is used to store unique elements, 
and its size is independent of the grid size.
*/
import java.util.HashSet;

public class _4_Find_missing_repeated_number {
    public static void main(String[] args) {
        int[][] grid = { { 1, 3 }, { 2, 2 } }; // Case 1
        //int[][] grid = { {9,1,7}, {8,9,2}, {3,4,6} };     // Case 2
        int[] ans = findMissingAndRepeating(grid);
        System.out.println(ans[0] + " " + ans[1]);
    }

    private static int[] findMissingAndRepeating(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();

        int a = 0;
        int b = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int num = grid[i][j];
                if (set.contains(num)) {
                    a = num;
                } else {
                    set.add(num);
                }
            }
        }

        for (int i = 1; i <= (int) Math.pow(grid.length, 2); i++) {
            if (!set.contains(i)) {
                b = i;
                break;
            }
        }

        return new int[] { a, b };

        /* 
        Approach
        O Initialization:
        
        Initialize a HashSet set to keep track of unique elements encountered in the grid.
        Initialize variables a and b to store the repeated and missing values, respectively.
        Grid Traversal:
        
        O Traverse the grid using nested loops.
        For each element in the grid:
        Check if the element is already present in the HashSet (set).
        If it is present, update the variable a to the current element.
        If it is not present, add the element to the HashSet.
        Find Missing Value:
        
        O After processing the entire grid, iterate from 1 to the square of the grid size.
        Find the first integer i that is not present in the HashSet.
        Update the variable b to this missing value.
        
        O Result:
        
        Return the pair [a, b] as the result.
        
        
         */
        /* // imp       Another solution
        int n = grid.length;
        int m = n * n;
        int[] numbers = new int[m];
        int[] ans = new int[2];
        int k = 0;
        
        // Flatten the 2D grid into a 1D array
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            numbers[k++] = grid[i][j];
        }
        }
        
        // Sort the array
        Arrays.sort(numbers);
        
        // Check for missing and repeating numbers
        if (numbers[0] != 1) {
        ans[1] = 1;
        }
        if (numbers[m - 1] != m) {
        ans[1] = m;
        }
        for (int i = 1; i < m; i++) {
        if (numbers[i] == numbers[i - 1]) {
            ans[0] = numbers[i];  // Repeating number
        }
        if ((numbers[i] - numbers[i - 1]) == 2) {
            ans[1] = (numbers[i] + numbers[i - 1]) / 2;  // Missing number
        }
        }
        
        return ans;
         */
    }
}

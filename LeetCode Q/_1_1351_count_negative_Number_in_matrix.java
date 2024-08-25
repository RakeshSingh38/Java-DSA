
// Leetcode Q : 1351 Count Negative Numbers in a Sorted Matrix ; level : easy
public class _1_1351_count_negative_Number_in_matrix {
    public static void main(String[] args) {
        int[][] grid = new int[][] { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        System.out.println("Total count of negatives in matrix is " + negativeNUmber(grid));
    }

    static int negativeNUmber(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                //if (grid[i][j] < 0) {
                //    count++;
                //}
                if (grid[i][j] < 0) {
                    count += grid[i].length - j; // since the array is sorted, as soon as first negative is found, remaining can be counted

                    // see   this break is important to stop the loop as soon as we find first negative, as we instant
                    break;
                }
            }
        }
        return count;
    }
    // a program to count negative numbers in matrix using binary search
    // a program to count negative numbers in matrix using binary search

    // static int negativeNUmber(int[][] grid) {
    //     int start = 0;
    //     int end = grid.length - 1;
    //     int temp = 0, count = 0;
    //     while (start <= end) {
    //         if (grid[start][end] <= 0) {
    //             count++;
    //             temp = count;
    //         }
    //         //int mid = (start + end) / 2;
    //         // below line is to avoid overflow   
    //         int mid = start + (end - start) / 2;
    //         if (grid[start][end] > grid[end][start]) {
    //             start = mid + 1;
    //         } else  {
    //             end = mid - 1;
    //         }
    //     }
    //     System.out.println(temp);
    //     //System.out.println(count);
    //     return grid[temp][temp];
    // }

}

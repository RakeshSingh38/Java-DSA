// Leetcode Q #1572 Matrix Diagonal Sum Easy
// https://leetcode.com/problems/matrix-diagonal-sum/

public class _11_Diagonal_Matrix_sum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(MatrixDiagonalSum(arr));
    }

    /**
    * Calculates the sum of the elements on the main diagonal and the secondary diagonal of a square matrix.
    *
    * @param arr The square matrix to calculate the sum for.
    * @return The sum of the elements on the main diagonal and the secondary diagonal.
    *
    * @throws IllegalArgumentException If the input matrix is not square (i.e., the number of rows is not equal to the number of columns).
    */

    // r        more efficient tc o(n) and sc o(1)
    private static int MatrixDiagonalSum(int[][] arr) {
        // Check if the input matrix is square
        if (arr.length != arr[0].length) {
            throw new IllegalArgumentException("Input matrix must be square");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Add the elements on the main diagonal and the secondary diagonal
            // here there is no need of 2nd loop as we are using i as an replacement
            sum += arr[i][i] + arr[i][arr.length - 1 - i];
        }

        // If the matrix has an odd number of rows/columns, subtract the center element (which is counted twice)
        if (arr.length % 2 != 0) {
            //  this is for the element at the center of the matrix
            //  we will subtract it as it with sum
            //  30 - 5 = 25
            sum -= arr[arr.length / 2][arr.length / 2];
        }

        return sum;
    }

    // r        less efficient as tc o(n^2) and sc o(1)
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j || (i + j) == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}

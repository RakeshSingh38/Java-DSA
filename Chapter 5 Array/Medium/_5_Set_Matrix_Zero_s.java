import java.util.Arrays;

/**
 * _5_Set_Matrix_Zero's
 */

// LeetCode 73. Set Matrix Zeroes
// https://leetcode.com/problems/set-matrix-zeroes/   

// Given an m x n matrix. If an element is 0, set its entire row and column to 0. 
// tip      Do it in-place.
public class _5_Set_Matrix_Zero_s {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }, };
        setZeroes(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    /* 
    Intuition
    The problem asks to modify the matrix in such a way that if an element in the matrix is 0, then its entire row and column
    should be set to 0. 
    The initial approach uses two boolean arrays to store information about which rows and columns have at least one zero. 
    Then, it iterates through the matrix twice to set the corresponding rows and columns to zero based on the information stored
    in the boolean arrays.
    
    Approach
    The approach is straightforward. 
    It first iterates through the matrix to identify the rows and columns that contain at least one zero. 
    Then, it iterates through the matrix again to set the entire row and column to zero if the corresponding boolean arrays
    indicate so.
    
    Complexity
    Time complexity: O(rows * cols) where rows and cols are the number of rows and columns in the matrix. 
    The algorithm iterates through the entire matrix twice.
    Space complexity: O(rows + cols) for the boolean arrays storing information about zero rows and zero columns.
     */
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

// hashSet approach
// class Solution {
// void makeZeroRow(int i,int [][]matrix,int n){
// for(int k=0;k<matrix[0].length;k++){
// matrix[i][k]=0;
// }
// }
// void makeZerocol(int j,int [][]matrix,int n){

//     for(int k=0;k<n;k++){
//         matrix[k][j]=0;
//     }
// }
// public void setZeroes(int[][] matrix) {
//     int n=matrix.length;
//     int [][]tempStore=new int[n][n];
//     Set<Integer> hashRow = new HashSet<Integer>();
//     Set<Integer> hashCol = new HashSet<Integer>();
//     for(int i=0;i<n;i++){
//         for(int j=0;j<matrix[i].length;j++){
//             if(matrix[i][j]==0){
//                 hashRow.add(i);
//                 hashCol.add(j);
//             }
//         }
//     }

//     Iterator<Integer> it = hashRow.iterator();
//     while(it.hasNext()){
//         makeZeroRow(it.next(),matrix,n);
//     }
//     it=hashCol.iterator();
//     while(it.hasNext()){
//         makeZerocol(it.next(),matrix,n);
//     }
// }
// }
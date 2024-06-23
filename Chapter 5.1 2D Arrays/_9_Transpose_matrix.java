//import java.util.Arrays;

public class _9_Transpose_matrix {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original matrix\n");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose matrix\n");
        rotateBy90(arr, arr.length);
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //int[][] temp = rotateby90(arr, arr.length);
        /* for (int[] i : temp) {
            for (int j : i) {
                System.out.print(j + " ");
                }
            System.out.println();
        }*/
        //swap(arr);
        //System.out.println(Arrays.deepToString((arr)));
        //transpose(arr);
        //System.out.println(Arrays.deepToString(transpose(arr)));
    }

    // r       very naive way of doing it
    static int[][] transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // transpose of 2D array is
                //System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        return arr;

        //int r = arr.length;
        //int c = arr[0].length;
        //int[][] temp = new int[c][r];
        //for (r = 0; r < arr.length; r++) {
        //    for (c = 0; c < arr[0].length; c++) {
        //        temp[c][r] = arr[r][c];
        //        //arr[r][c] = arr[c][r];
        //        //arr[c][r] = temp;
        //    }
        //}
        //return temp;
    }

    public static void rotateBy90(int[][] matrix, int n) {
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    /*static void rotateby90(int matrix[][], int n) {
    
        // Transpose the matrix
        //swap(matrix);
        for (int i = 0; i < matrix.length; i++)
            for (int j = i; j < matrix[0].length; j++) {
                //swapping elements at (i,j) and (j,i).
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        //        // Reverse each row
        for (int i = 0; i < matrix[0].length; i++)
            for (int j = 0, k = matrix[0].length - 1; j < k; j++, k--) {
                //swapping elements in each column.
                int temp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = temp;
            }
    
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }*/

    /*   static int[][] rotateBy90(int arr[][]) {
        int n = arr.length;
        // first we transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(arr, i, j);
            }
        }
        // then we reverse the columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                swap(arr, i, j);
            }
        }
        return arr;
    }*/

    static void swap(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }
    /* 
    for (int cols = 0; cols < arr[0].length; cols++) {
    
        // if row is even we move down else move up
        for (int rows = 0; rows < arr[0].length; rows++) {
            if (cols % 2 == 0) {
                System.out.print(arr[cols][rows] + " ");
            } else {
                // its going left to right then right to left and so on
                //  -----↓
                //  ↑-----
                //  -----↓
                System.out.print(arr[cols][arr[0].length - 1 - rows] + " ");
            }
        }
        System.out.println();
        //}
    }
    return arr;
    
    //  1 2 3 
    //  6 5 4
    //  7 8 9
     */
}
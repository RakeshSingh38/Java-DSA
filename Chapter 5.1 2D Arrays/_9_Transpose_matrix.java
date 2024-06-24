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

        // r        main function
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
                // swap(matrix);
                // or
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        /* 
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[j][i] = temp;
        
                this gives 👇👇👇
                            1 4 7
                            2 5 8
                            3 6 9
         */
        // Reverse each row

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
            /* this code gives 👇👇👇
                                7 4 1
                                8 5 2
                                9 6 3
            */

            /*   // r        or we can also do this 
                //          this is a two pointer approach
                for(int i=0;i<n;i++){
                int low =0;
                int high = n-1;
                while(low <high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
            }
             */
        }
    }

    static void swap(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
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
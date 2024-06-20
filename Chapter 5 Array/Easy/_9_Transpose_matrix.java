public class _9_Transpose_matrix {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        //System.out.println(Arrays.deepToString((arr)));
        //transpose(arr);
        //System.out.println(Arrays.deepToString(transpose(arr)));
        transpose2(arr.length, arr);
    }

    static int[][] transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // transpose of 2D array is
                System.out.print(arr[j][i] + " ");
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

    public static void transpose2(int n, int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // transpose of 2D array is
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
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
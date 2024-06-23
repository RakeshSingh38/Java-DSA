import java.util.Arrays;

public class _Square_matrix {
    public static void main(String[] args) {
        int[][] arr = { { 6, 5, 4 },
                { 1, 2, 5 },
                { 7, 9, 7 } };

        int temp[][] = squareMatrix(arr, arr.length);

        for (int[] i : temp) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(squareMatrix(arr, arr.length)));

    }

    static int[][] squareMatrix(int[][] arr, int n) {
        int temp[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // experiment with these
                if (i == 0 || j == 0) {
                    continue;
                } else {
                    temp[i][j] = arr[i][j];
                }

                /* if (i == 1 || j == 1) {
                    continue;
                } else {
                    temp[i][j] = arr[i][j];
                }
                // this gives output as
                6 0 4
                0 0 0
                7 0 7    
                */
            }
            System.out.println();
        }
        return temp;
    }
}

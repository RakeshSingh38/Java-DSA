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

    }

    static int[][] squareMatrix(int[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 1 && j == 2) {
                    arr[i][j] = 0;
                }
            }
            System.out.println();
        }
        return arr;
    }
}

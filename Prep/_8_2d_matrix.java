public class _8_2d_matrix {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int[][] arr = {
                { 10, 20, 30, 40, 50 },
                { 60, 70, 80, 90, 100 },
                { 110, 120, 130, 140, 150 },
                { 160, 170, 180, 190, 200 }
        };

        // imp      print matrix columnwise     
        System.out.println("\n\n");
        // only loops are exchange else same
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        int j = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][j] + " ");
        }
    }
}

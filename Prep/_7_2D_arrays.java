public class _7_2D_arrays {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int[][] arr = {
                { 10, 20, 30, 40, 50 },
                { 60, 70, 80, 90, 100 },
                { 110, 120, 130, 140, 150 },
                { 160, 170, 180, 190, 200 }
        };

        System.out.println("Original 2D array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose of 2D array");
        // Print 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // transpose of 2D array is
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        /*     System.out.println("\n\n");
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/

        /* 
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
                n=4;
                m=5;
         */
        // imp      print matrix columnwise   (same as transpose)  
        System.out.println("\n\n");
        for (int j = 0; j <m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

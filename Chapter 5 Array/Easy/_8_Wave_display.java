public class _8_Wave_display {
    public static void main(String[] args) {
        int[][] arr = { { 11, 12, 13, 14 },
                { 21, 22, 23, 24 },
                { 31, 32, 33, 34 },
                { 41, 42, 43, 44 } };
        waveDisplay(arr);
    }

    private static void waveDisplay(int[][] arr) {
        for (int c = 0; c < arr[0].length; c++) {

            // if row is even we move down else move down
            if (c % 2 == 0) {
                for (int r = 0; r < arr.length; r++) {
                    System.out.print(arr[r][c] + " ");
                }
            } else {
                // move up
                for (int r = arr.length - 1; r >= 0; r--) {
                    System.out.print(arr[r][c] + " ");
                }
            }
            //System.out.println();

            /* 
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
             */
        }
    }
}
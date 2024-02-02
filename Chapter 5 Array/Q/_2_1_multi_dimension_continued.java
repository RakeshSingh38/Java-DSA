// package Q;
public class _2_1_multi_dimension_continued {

    // -> remember to include boiler plate
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 6, 4, 5 }
        };
                    
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            // System.out.println(arr[row].length);
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
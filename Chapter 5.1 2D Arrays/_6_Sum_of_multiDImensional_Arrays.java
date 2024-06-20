/**
 * _12_Sum_of_multiDImensional_Arrays
 */
public class _6_Sum_of_multiDImensional_Arrays {

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 1, 2, 3 } };
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum = sum + arr1[i][j];
            }
        }
        System.out.println(sum);

    }
}
import java.util.Arrays;

public class _9_1_2d_array_using_function {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };
        System.out.println("Original array");
        System.out.print(Arrays.deepToString(arr)+"\n");
        System.out.println();
        System.out.println("New array after modification");
        changeArray(arr);
        System.out.print(Arrays.deepToString(arr)+"\n");
    }

    private static void changeArray(int[][] arr) {
        arr[0][0] = 1000;
    }
}

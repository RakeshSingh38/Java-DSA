import java.util.Arrays;

public class _3_Left_rotate_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // k means length
        System.out.println(Arrays.toString(rotateArray(arr, 5)));
        ;
    }

    static int[] rotateArray(int[] arr, int k) {
        // Write your c    
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[(i + k + 1) % arr.length];
        }
        for (j = 0; j < arr.length; j++) {
            arr[j] = temp[j];
        }
        return arr;
    }
}

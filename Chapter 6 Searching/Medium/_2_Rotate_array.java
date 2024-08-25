import java.util.Arrays;

// tip    similar Q already solved in LeetCode Q 
public class _2_Rotate_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        //int[] ans = rotate(arr, 3);
        //System.out.println(Arrays.toString(ans));
        //rotate(arr, 3);
        System.out.println(Arrays.toString(rotate(arr, 3)));
        //rotate(arr, 3);
        //int rev = 
        //String[] str = { "abcde", "dbace" };
        //Arrays.sort(str);
        //st[] ans = str.length.join(" ");
        //System.out.println(ans);

    }

    static int[] rotate(int[] arr, int k) {
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[(i + k) % arr.length];
        }
        for (j = 0; j < arr.length; j++) {
            arr[j] = temp[j];
        }
        return arr;
    }
}

/* 
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = (i + k) % arr.length;
            //int temp2 = arr[temp];
            System.out.print(arr[temp] + " ");
        }
 */

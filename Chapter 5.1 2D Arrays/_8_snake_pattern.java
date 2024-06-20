import java.util.*;

// Q      GFG Snake pattern
public class _8_snake_pattern {
    public static void main(String[] args) {
        int[][] arr = { { 45, 48, 54 },
                { 21, 89, 87 },
                { 70, 78, 15 } };

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(Arrays.toString(arr[i]));
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else if (i % 2 != arr.length) {
                for (int l = arr.length - 1; l >= 0; l--) {
                    System.out.print(arr[i][l] + " ");
                }
            }
            System.out.println();
        }
        ArrayList<Integer> li = spiral(arr);

        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
    }

    static ArrayList<Integer> spiral(int arr[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    result.add(arr[i][j]);
                }
            } else {
                for (int l = arr.length - 1; l >= 0; l--) {
                    result.add(arr[i][l]);
                }
            }
        }
        return result;
    }
}

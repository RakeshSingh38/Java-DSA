import java.util.Arrays;

public class _18_Test {

    // 283. Move Zeroes
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 1, 0, 3, 0, 12, 0, 0 };
        System.out.println(Arrays.toString(arr));
        System.out.println("1st");
        //removeZeroes(arr);
        System.out.println();
        System.out.println("2nd");
        //removeZeroes(arr);
        System.out.println();
        // r        optimal soln
        //r0(arr);

        System.out.println("4th");
        moveZeroesBetter(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void r0(int[] arr) {
        // r        O N and O 1
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[s] = arr[i];
                s++;
            }
        }
        //System.out.println(s);
        //System.out.println(Arrays.toString(arr));
        //int count = 0;
        while (s < arr.length) {
            arr[s] = 0;
            s++;
            //count++;
        }
        //System.out.println(count);
        //System.out.println(Arrays.toString(arr));

    }

    static void moveZeroesBetter(int[] arr) {
        // two pointer approach
        // r        Better 
        int j = 0, i = 0, n = arr.length;
        while (i < n) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        /* 
            int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
         */
    }

    static void removeZeroes(int[] arr) {
        // two pointers
        int s = 0, e = arr.length - 1;
        //int i = 0;
        // w        same shuffled again
        while (s <= e) {
            if (arr[s] == 0 && arr[e] != 0) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            } else if (arr[s] != 0) {
                s++;
            } else if (arr[e] == 0) {
                e--;
            }
            //return arr;
        }
        System.out.println(Arrays.toString(arr));
    }

    //using simple approach
    static void removeZero(int[] arr) {
        // w     same order is shuffled 
        int s = 0, e = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}

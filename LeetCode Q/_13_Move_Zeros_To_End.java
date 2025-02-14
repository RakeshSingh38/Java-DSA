// Leetcode Q  #283  Move Zeroes Easy
// https://leetcode.com/problems/move-zeroes/  

// 283. Move Zeroes

// tip    if its !=0 then we swap it with the non zero element in the array and by doing this process we are effectively moving all non zero elements to the start of the array.

// Time complexity : O(n)

// see          or we can find the count of non zero elements and then fill the rest of the array with zeros , it will take 2 loops one to count the non zero elements and another to fill the rest of the array with zeros
import java.util.Arrays;

public class _13_Move_Zeros_To_End {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 2, 0, 2, 0 };
        System.out.println(Arrays.toString(arr));
        System.out.println("1st");
        //removeZeroes(arr);
        System.out.println();
        System.out.println("2nd");
        //removeZeroes(arr);
        System.out.println();
        // r        optimal soln
        //moveZeroes_Optimize(arr);

        System.out.println("4th");
        moveZeroes_Optimize(arr);
        //System.out.println(Arrays.toString(arr));

        // see      better approach
        //moveZeroes_Better(arr);

    }

    static void moveZeroes_Optimize(int[] arr) {
        // r        O N and O 1
        // r        Optimized 

        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                // tip    we are internally modifying the array
                //        the 0's in the array wil be replaced with non zero Elements
                arr[s] = arr[i];
                s++;
            }
        }

        System.out.println(Arrays.toString(arr));
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

    static void moveZeroes_Better(int[] arr) {
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

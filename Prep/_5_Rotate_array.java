import java.util.*;

public class _5_Rotate_array {
    public static void main(String[] args) {

        int[] arr = { 1 }; 
        // if input is -5 or -1 only then answer will be same i,e k will be 0 as -5 & 3 = 0
        int k = 3;
        int n = arr.length;
        // what it does is it takes the remainder of k/n
        // and then rotates the array k % n times
        // the value of k is always less than n
        // multiples of n are useless that is why we take remainder
        // coz if u rotae the array n (arr.length) times it will be the same
        //k = k % n;
        System.out.println("value of k " + k + " \n");
        System.out.println(" 0  1  2  3  4  5  6");
        System.out.println(" |  |  |  |  |  |  |");
        System.out.println(Arrays.toString(arr));
        // imp      1 > Reverse the whole array
        reverse(arr, 0, n - 1);
        System.out.println("\nAfter reversing the array\n");
        System.out.println(" 0  1  2  3  4  5  6");
        System.out.println(" |  |  |  |  |  |  |");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        // imp      2 > Reverse the 1st part till k 
        reverse(arr, 0, k - 1);
        System.out.println("Reverse the 1st part till k\n");
        System.out.println(" 0  1  2  3  4  5  6");
        System.out.println(" |  |  |  |  |  |  |");
        System.out.println(Arrays.toString(arr));

        System.out.println();

        // imp      3 > Reverse the 2nd part till the end
        System.out.println("Reverse the 2nd part till the end\n");
        reverse(arr, k, n - 1);
        System.out.println(" 0  1  2  3  4  5  6");

        System.out.println(" |  |  |  |  |  |  |");
        System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}

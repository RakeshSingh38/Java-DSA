import java.util.Arrays;

public class practise2_ {
    public static void main(String[] args) {
        //int[] arr = { 4, 6, 2, 3 };
        int[] arr = { -1, -4, 3, 5, -15, 4 };

        //System.out.println(min_Count(arr));
        int arr2[] = { -1, -4, 3, 5, -15, 4 };
        System.out.println(goodInteger(arr));
        //System.out.println(goodInteger_Optimze(arr2));
    }


    private static int goodInteger(int[] arr) {
        // write code for Good integer with 2 for loops with O
   
    }

    private static int min_Count(int[] arr) {
        Arrays.sort(arr);
        int N = arr.length;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            // after each iteration, the length of the array will be reduced by 1 
            int temp = arr[i] * (N - i);
            ans += temp;
        }
        return ans;
    }
}

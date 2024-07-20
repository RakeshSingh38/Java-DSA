import java.util.Arrays;

// Leetcode 1480. Running Sum of 1d Array (Easy)
public class _7_Running_sum_of_1d_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] ans = runningSum(arr);
        //for (int i : ans) {
        //    System.out.print(i + " ");
        //}
        System.out.println(Arrays.toString(ans));
    }

    /* 
    Intuition
    It's an easy problem just make sure u understand how array is stored.
    
    Approach
    here arr[0] = 1 by default as indexing starts from 0
    here what we are doing is storing the result of the previous element and then adding the next element .
    
        // example :-
        //  Element     1 2 3 4
        //  index       0 1 2 3
    
        https://leetcode.com/problems/running-sum-of-1d-array/solutions/4658330/easy-explaination-java-tc-o-1-sc-o-1/
    
     */
    private static int[] runningSum(int[] arr) {
        //int[] answer = new int[arr.length];
        //answer[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
            //System.out.println(arr[i - 1]+arr[i]);
            //System.out.println(answer[1]);
        }
        return arr;
    }
}
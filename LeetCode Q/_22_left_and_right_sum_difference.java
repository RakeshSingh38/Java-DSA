import java.util.Arrays;

public class _22_left_and_right_sum_difference {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 8, 3 };
        System.out.println(Arrays.toString(leftRightDifference(arr)));
    }

    public static int[] leftRightDifference(int[] arr) {
        int n = arr.length;

        int answer[] = new int[n];
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        leftSum[0] = 0;
        rightSum[0] = 0;
        //int sum = 0;
        /* 
        [0,10,14,22] 
        
        [15,11,3,0]
         */
        for (int i = 1; i < arr.length; i++) {
            // if(answer.length==arr.length){
            // }
            //if (leftSum[i] == 0) {
            leftSum[i] = leftSum[i - 1] + arr[i - 1];
            //} 
            //}
        }
        System.out.println("left sum is " + Arrays.toString(leftSum));
        for (int i = n-2; i >= 0; i--) {
            // if(answer.length==arr.length){
            //if (rightSum[i] == 0) {
            rightSum[i] = rightSum[i + 1] + arr[i + 1];
            //} 
        }
        // }
        //}
        System.out.println("right sum is " + Arrays.toString(rightSum));

        for (int i = 0; i < arr.length; i++) {
            // if(answer.length==arr.length){
            answer[i] = Math.abs(rightSum[i] - leftSum[i]);
            // }
        }
        return answer;
    }
}

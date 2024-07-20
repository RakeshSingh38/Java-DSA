// Leetcode : 53. Maximum Subarray (easy)
// https://leetcode.com/problems/maximum-subarray/
// time complexity of kadane's algorithm O ( n )
// tip    Kadane's Algorithm if we see any negative value we make it 0 thats it
// -2 = 0 
// -1 = 0
// -4 = 0
//  7  we will count this

/**
 * This class demonstrates the implementation of Kadane's algorithm to find the maximum subarray sum.
 */
public class _13_Max_SubArray_Kadanes_algorithm {
    /**
     * The main method of the program.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        int[] arr = { -1 };
        Kadane_s_Algorithm(arr);

        System.out.println(Math.max(0, -1));
    }

    // Finds the maximum subarray sum using Kadane's algorithm.

    private static int Kadane_s_Algorithm(int[] arr) {
        int currSum = 0;
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            // this small logic eliminated the Math.max(currSum, maxSum) ( ❌❌ )
            // it doesnt solved it , i just have to make sure the correct order is correct to handle -1

            // if i/p is -1 and currSum is 0 i have to return -1 as its bigger
            // have to be careful about the order of code
            //maxSum = Math.max(currSum, maxSum);

            //if (currSum > maxSum) {
            //    maxSum = currSum;
            //}

            // error :   facing error when input is -1 it returns 0 instead of returning -1  ( error at case 195 )
            //              so i have to change the order of code (make sure its above main logic)
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("Max sum is " + maxSum);
        System.out.println(currSum);
        return maxSum;
    }

}

/* 
int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    
    for (int i = 0; i < nums.length; i++) {
        currentSum += nums[i];
        
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }
        
        if (currentSum < 0) {
            currentSum = 0;
        }
    }
    
    return maxSum;
 */

/* imp      mine solution
int currSum = 0;
    int maxSum = arr[0];
    for (int i = 0; i < arr.length; i++) {
        currSum += arr[i];
        // int temp=-1;
    
        
    //    if (arr[0] == -1) {
    //         return -1;
    //     }
    if (currSum < 0) {
            maxSum = Math.max(currSum, maxSum);
            currSum = 0;
        }
    
        if(currSum>maxSum){
            maxSum=currSum;
        }
        maxSum = Math.max(currSum, maxSum);
    }
    // System.out.println("Max sum is " + maxSum);
    // System.out.println(currSum);
    return maxSum;
  */

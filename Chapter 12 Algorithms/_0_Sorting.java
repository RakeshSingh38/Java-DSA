import java.util.Arrays;

// Q      1. Good Integer ( for distinct elements )
public class _0_Sorting {
    public static void main(String[] args) {
        //int[] arr = { 4, 6, 2, 3 };
        int[] arr = { 3, 0, 1, 2, 3, 5 };

        // Q        minimum count of elements to reduce the cost
        System.out.println("Minimum elements to reduce cost -> " + min_Count(arr) + "\n");
        //int arr2[] = { -1, -4, 3, 5, -15, 4, 3 };
        
        int arr2[] = { 0, 2, 2, 3, 3, 8, 4, 5 };
        System.out.println("Good Integer for Distinct Elements only -> " + goodInteger_Optimze(arr2) + "\n");
        //System.out.println(goodInteger(arr2));

        // fix      handled the 0th index case if value and index is same
        int arr3[] = { 0, 2, 2, 3, 3, 8 };
        //int arr3[] = { -4, -2, 3, 3, 5, 5, 5, 5, 8, 8, 8, 10, 17 };
        System.out.println("Good Integer for Repeating values -> " + goodInteger_With_repeating_values_Optimze(arr3) + "\n");
        
        //System.out.println(goodInteger_With_repeating_values(arr2));
    }

    // imp     Optimze Solution for Repeating elements T.C  =  O (nlogn)  S.C = O(n)
    private static int goodInteger_With_repeating_values_Optimze(int[] arr) {
        int count = 0;
        int less_count = 0;
        for (int i = 1; i < arr.length; i++) {
            // fix   if 0th index is the good integer as index and value is same we need to count it
            if (arr[i - 1] == 0) {
                count++;
            }
            if (arr[i] != arr[i - 1]) {
                less_count = i;
            }

            if (arr[i] == less_count) {
                count++;
            }
        }
        //return less_count - count;
        return count;
    }

    // imp     Optimze Solution for Distinct elements T.C  = ( 0(nlogn) ) S.C = O(n)
    private static int goodInteger_Optimze(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                count++;
            }
        }
        return count;
    }

    @SuppressWarnings("unused")
    // ->     my solution for distinct elements not working for repeating elements 0(n^2)
    private static int goodInteger(int[] arr) {
        int N = arr.length;
        int temp = 0;
        //Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 1; j < N; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                    //System.out.println("count is " + count);
                    if (arr[i] == arr[j]) {
                        temp = count;
                        //return arr[i];
                        //count2++;
                    }
                    //System.out.println(count2);
                    //System.out.println(temp + " okkk");
                }
                //System.out.println(temp);
            }
        }
        //System.out.println("tempppppp");
        return temp;
    }

    // Q        minimum count of elements to reduce the cost T.C  = ( 0(nlogn) ) S.C = O(n)
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

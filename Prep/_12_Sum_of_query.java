public class _12_Sum_of_query {
    // Q     given n array elements and q queries on an array, for each query calculate sum of all elements in given range
    public static void main(String[] args) {
        int[] arr = { 4, 1, 6, -2, 7 };
        int[][] queries = { { 0, 4 }, { 1, 3 }, { 2, 4 } };
        int left = 5;
        if (left != 5) {
            sumInGivenRange(arr, queries);
            sums(arr, queries);
            sumQuery(arr, queries);
        }

        sumQueryOptimal(arr, queries);
    }

    static void sumQueryOptimal(int[] arr, int[][] Query) {
        int[] pf = prefixSum(arr);

        // Time complexity of this approach is O(n) for prefix sum and O(1) for each query
        // So, the overall time complexity is O(n + q).
        // space complexity is O(n) for prefix sum array
        for (int i = 0; i < Query.length; i++) {
            int left = Query[i][0];
            int right = Query[i][1];

            int sum = 0;
            if (left > 0) {
                sum = pf[right] - pf[left - 1];
            } else {
                sum = pf[right];
            }
            System.out.println(sum);
        }
    }

    static int[] prefixSum(int[] arr) {
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        // above can be removed if used tip comment and return arr;
        for (int i = 1; i < arr.length; i++) {
            pf[i] = pf[i - 1] + arr[i];
            // tip      for simplicity 
            //arr[i] = arr[i - 1] + arr[i];
        }
        //return arr;
        return pf;
    }

    private static void sumInGivenRange(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                sum += arr[j]; // 4+1+6+-2+7
            }
            System.out.println(sum);
        }
    }

    static void sums(int[] arr, int[][] queries) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int sum = prefixSum[r] - prefixSum[l] + arr[l];
            System.out.println(sum);
        }
    }

    static void sumQuery(int[] arr, int[][] Query) {
        /*  // imp    using forEnhanced loop 
        //  here we dont use arr[] use put the i    
        for (int[] i : Query) {
            int left = i[0];
            int right = i[1];
            int sum = 0;
            for (int j = left; j <= right; j++) {
                sum = sum + arr[j];
            }
            System.out.println(sum);
        }*/

        // using regular for loop
        for (int i = 0; i < Query.length; i++) {
            int left = Query[i][0];
            int right = Query[i][1];

            int sum = 0;
            for (int j = left; j <= right; j++) {
                sum = sum + arr[j];
            }
            System.out.println(sum);
        }
    }

}

//    public static void main(String[] args) {
//        int[] arr = { 1, 2, 3, 4, 5 };
//        int[][] queries = { { 1, 3 }, { 2, 4 }, { 0, 4 } };
//        int[] result = sumQuery(arr, queries);
//        for (int i : result) {
//            System.out.println(i);
//        }
//    }
//
//    public static int[] sumQuery(int[] arr, int[][] queries) {
//        int[] result = new int[queries.length];
//        for (int i = 0; i < queries.length; i++) {
//            int sum = 0;
//            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
//                sum += arr[j];
//            }
//            result[i] = sum;
//        }
//        return result;
//    }

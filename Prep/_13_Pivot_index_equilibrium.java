
public class _13_Pivot_index_equilibrium {
    public static void main(String[] args) {
        //int[] arr = { -2, 6, 3, 4 };
        int[] arr = { -7,1,5,2,-4,3,0};
        System.out.println(pivotIndex(arr));
    }

    private static int pivotIndex(int[] arr) {
        int[] pf = prefixSum(arr);
        int ans = 0;
        int N = arr.length;
        for (int i = 1; i < arr.length - 1; i++) {
            int leftSum = pf[i - 1];
            int rightSum = pf[N - 1] - pf[i];
            //System.out.print(leftSum+" "+ rightSum+" ");
            if (leftSum == rightSum) {
                ans++;
            }
        }

        if (0 == pf[N - 1] - pf[0]) {
            ans++;
        }

        if (pf[N - 2] == 0) {
            ans++;
        }
        return ans;

    }

    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] pf = new int[n];
        pf[0] = arr[0];
        // above can be removed if used tip comment and return arr;
        for (int i = 1; i < n; i++) {
            // 
            pf[i] = pf[i - 1] + arr[i];

            // tip      for simplicity 
            //arr[i] = arr[i - 1] + arr[i];
        }
        //return arr;
        return pf;
    }
}
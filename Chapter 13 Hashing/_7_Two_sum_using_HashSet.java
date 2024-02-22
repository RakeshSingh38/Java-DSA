import java.util.*;

public class _7_Two_sum_using_HashSet {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int ans[] = TwoSumUsing_HashSet(arr, 11);
        //for (int i = 0; i < ans.length; i++) {
        //    System.out.println(ans[i] + " ");
        //}
        System.out.println(Arrays.toString(ans));
    }

    private static int[] TwoSumUsing_HashSet(int[] arr, int k) {
        //   two sum using hashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == true) {
                hm.put(arr[i], arr[i] + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = k - a;
            if (a != b && hm.containsKey(b) == true) {
                return new int[] { a, b };
            } else if (a == b && hm.containsKey(b) == true && hm.get(b) > 1) {
                return new int[] { a, b };
            }
        }
        return new int[] { -1, -1 };
    }
}

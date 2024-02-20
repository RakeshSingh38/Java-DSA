import java.util.HashMap;
import java.util.HashSet;

public class _7_Two_sum_using_HashSet {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int ans = TwoSumUsing_HashSet(arr, 5);
        System.out.println(ans);
    }

    private static int TwoSumUsing_HashSet(int[] arr, int k) {
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
            int ans = k - arr[i];
            if (hm.containsKey(ans) == true) {
                return 1;
            }
        }
        return -1;
    }
}

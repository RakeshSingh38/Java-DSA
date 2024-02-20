import java.util.HashMap;

/**
 * _5_Find_First_Non_repeating_element
 */
public class _5_Find_First_Non_repeating_element {

    public static void main(String[] args) {
        int[] arr = { 4, 1, 6, -2, 7, 1, 1, 4, 4 };
        int ans = firstNonRepeatingE(arr);
        System.out.println(ans);
    }

    private static int firstNonRepeatingE(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == true) {
                hm.put(arr[i], arr[i] + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
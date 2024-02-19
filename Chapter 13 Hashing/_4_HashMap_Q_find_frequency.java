import java.util.HashMap;

public class _4_HashMap_Q_find_frequency {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 6, -2, 7, 1, 1, 4, 4 };
        int[] queries = { 1, 2, 4 };
        //findFrequency(arr, queries);
        findFrequency_Using_hashMap(arr, queries);
    }

    @SuppressWarnings("unused")
    private static void findFrequency(int[] key, int[] queries) {
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i];
            int count = 0;
            for (int j = 0; j < key.length; j++) {
                if (val == key[j]) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }

    public static void findFrequency_Using_hashMap(int[] arr, int[] queries) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == true) {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp + 1);
                // ->     or we can eliminate the temp variable 
                //hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (int j = 0; j < queries.length; j++) {
            if (hm.containsKey(queries[j]) == true) {
                System.out.print(hm.get(queries[j]) + " ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}

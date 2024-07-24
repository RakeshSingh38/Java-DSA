import java.util.*;

public class _23_Unique_number_of_elements {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int[] arr = { 4, 0, 2, -5, -4 };
        //for (int i = 0; i < arr.length; i++) {
        //    arr[i] = sc.nextInt();
        //}
        System.out.println(unique_No_Of_Elements(arr));
        //sc.close();
    }

    static boolean unique_No_Of_Elements(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
        System.out.println();
        Set<Integer> uniqueCounts = new HashSet<>(map.values());
        System.out.println(uniqueCounts);
        return uniqueCounts.size() == map.size();
    }
}

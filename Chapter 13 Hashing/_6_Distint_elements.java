import java.util.HashSet;

public class _6_Distint_elements {
    public static void main(String[] args) {
        int arr[] = { 10, 10, 10, 20, 20 };
        findDistinctElements(arr);
    }

    private static void findDistinctElements(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
        ;
    }
}

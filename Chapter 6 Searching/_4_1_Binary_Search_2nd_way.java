import java.util.*;
import java.util.stream.Collectors;

public class _4_1_Binary_Search_2nd_way {
    // Another type of binary search using Collections.binarySearch
    // This is the 2nd way of doing binary search
    // its runtime is 6ms not recommended
    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 5, 9, 12 };
        int target = 2;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        List<Integer> tempList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> list4 = new ArrayList<>(tempList);

        int pos = Collections.binarySearch(list4, target);
        if (pos < 0) {
            return -1;
        }
        return pos;
    }
}

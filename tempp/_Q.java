import java.util.ArrayList;
import java.util.List;
//  print using list and string
public class _Q {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        printUsingList(arr);
        //System.out.println(ans);
    }

    private static void printUsingList(int[] arr) {
        // print using list
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        for (int i : arr) {
            list2.add(String.valueOf(i));
        }
        System.out.println(list2);
    }
}

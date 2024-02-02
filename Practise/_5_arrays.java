import java.util.ArrayList;
import java.util.Arrays;

public class _5_arrays {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 43, 21, 52 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.remove(1);
        //list.toArray();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        //System.out.println(list);
    }
}

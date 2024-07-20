//package LeetCode Q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _17_concat_array {
    public static void main(String[] args) {
        System.out.println("hh");

        int[] arr = { 1, 2, 1 };

        System.out.println(Arrays.toString(concatArray(arr)));

        System.out.println("Using list");
        System.out.println(Arrays.toString(conactUsingList(arr)));
    }

    static int[] concatArray(int[] arr) {
        int[] arr2 = new int[arr.length];

        int[] res = new int[arr.length + arr2.length];
        //System.out.println(res.length);
        //int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            res[i] = arr[i];
            res[i + arr.length] = arr2[i];
        }
        //System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(res));
        //for (int i = 0; i < res.length; i++) {
        //    //if (res[i] != arr[i])
        //    if (res[i] != arr[i]) {
        //        res[i] = arr[i];
        //    }
        //    System.out.println(Arrays.toString(res));
        //}
        System.out.println(Arrays.toString(res));

        //for (int i = 0; i < arr2.length; i++) {
        //    res[i] += arr2[i];
        //}
        //System.out.println(res);

        //System.out.println(Arrays.toString(arr2));
        //System.out.println(Arrays.toString(arr));

        //return new int[] { arr, arr2 };

        return res;
    }

    public static int[] conactUsingList(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            //list.add(arr[i] + arr.length);
        }
        //for (int i = 0; i < arr.length; i++) {
        //    list.add(arr[i]);
        //    //list.add(arr[i] + arr.length);
        //}
        
        // or

        list.addAll(list);

        //int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        //return result;
        // or

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

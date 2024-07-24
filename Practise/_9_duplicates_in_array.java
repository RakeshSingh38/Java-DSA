import java.util.*;

//import java.util.HashMap;
//import java.util.HashSet;

/**
 * _9_duplicates_in_array
 */
public class _9_duplicates_in_array {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1 };
        //System.out.println(duplicates(arr));
        //System.out.println(duplicatesUsing2Loops(arr));
        //System.out.println(duplicates_Using_hashMap(arr));
        //System.out.println(duplicates_Using_hashSet(arr));
        System.out.println(duplicates_Using_Length_And_HashSet(arr));
    }

    static boolean duplicates(int[] arr) {
        //Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }

        }
        return false;
    }

    static boolean duplicatesUsing2Loops(int[] arr) {
        //boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    //flag = true;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean duplicates_Using_hashMap(int[] arr) {
        Map<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.containsKey(arr[i])) {
                //System.out.println(set);
                return true;
            } else {
                //System.out.println(set);
                set.put(i, arr[i]);
            }
        }
        return false;
    }

    static boolean duplicates_Using_hashSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                //System.out.println(set);
                    return true;
            } else {
                //System.out.println(set);
                set.add(arr[i]);
            }
        }
        return false;
    }

    static boolean duplicates_Using_Length_And_HashSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        //System.out.println(set);

        // tip      comparing length of both variables to check if its equal or not
        //          as hashSet cant have same values so it will be not counted
        return arr.length != set.size();
    }
}
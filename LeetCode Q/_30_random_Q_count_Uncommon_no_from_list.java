import java.util.HashSet;

public class _30_random_Q_count_Uncommon_no_from_list {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = { 11, 12, 13, 4, 5, 6, 7, 18, 19, 20 };
        //int[] a = { 9, 12, 5, 4, 51, 4 };
        //int[] b = { 9, 12, 5, 6, 9, 4, 1 };

        System.out.println(unCommon(a, b));
        int i = 0, count = 0;
        System.out.println(unCommon_Using_recursion(a, b, i, count));

        System.out.println(countElements(a, b));
    }

    static int unCommon(int[] a, int[] b) {
        int count = 0;
        //for (int i = 0; i < a.length; i++) {
        //    if (a[i] != b[i]) {
        //        count++;
        //    }
        //}
        //for (int i = 0; i < b.length; i++) {
        //    if (b[i] != a[i]) {
        //        count++;
        //    }
        //}
        int i = 0;
        int c = Math.min(a.length, b.length);
        while (i < c) {
            if (a[i] != b[i]) {
                count++;
            }

            if (b[i] != a[i]) {
                count++;
            }
            i++;
        }
        System.out.println(count);
        return count;
    }

    // r        recursive approach
    static int unCommon_Using_recursion(int[] a, int[] b, int i, int count) {
        if (i >= Math.min(a.length, b.length)) {
            System.out.println(count);
            return count;
        }

        if (a[i] != b[i]) {
            count += 2;
        }

        return unCommon_Using_recursion(a, b, i + 1, count);

    }

    static int countElements(int[] a, int[] b) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : a) {
            set1.add(num);
        }

        for (int num : b) {
            set2.add(num);
        }

        int count = 0;
        for (int num : a) {
            if (!set2.contains(num)) {
                count++;
            }
        }
        for (int num : b) {
            if (!set1.contains(num)) {
                count++;
            }
        }

        return count;
    }
}

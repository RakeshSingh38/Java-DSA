import java.util.HashSet;

// Leetcode Sum of Multiples ( easy )
// Given an integer n, return the sum of all numbers that are a multiple of 3 or 5 or 7.
// link :- https://leetcode.com/problems/sum-of-multiples/

public class _2_Sum_of_multiples {
    public static void main(String[] args) {
        //countFactors(7); // TC : O( n ) ✅✅
        countFactors_UsingHashSet(7); // TC : O( n + n ) 😓😓
    }

    static int countFactors(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                set.add(i);
            }
        }
        for (int i : set) {
            sum += i;
        }
        System.out.println(sum);
        return sum;

        //    HashMap<Integer, Integer> set = new HashMap<>();
        //    int sum = 0;
        //    for (int i = 1; i <= n; i++) {
        //        if (i % n == 0) {
        //            if (set.containsKey(3) || set.containsKey(5) || set.containsKey(7)) {
        //                sum += set.get(i);
        //                System.out.print(i + " ");
        //            }
        //        else {
        //            set.put(i, i);
        //        }
        //    }
        //}
        //System.out.print(sum + " ");
    }

    static int countFactors_UsingHashSet(int n) {
        // TC : O( n + n ) 😓😓
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                set.add(i);
            }
        }
        for (int i : set) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
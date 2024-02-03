// Leetcode Q 881 boats to save people , Medium
// https://leetcode.com/problems/boats-to-save-people/

import java.util.Arrays;

/* 
        Approach
    Sorting the People array.
    Using Two Pointer checking for the sum of people a boat can carry.

        Complexity
        Arrays.sort() takes O(NlogN) time.
        
        and the two pointer approach takes O(N) time.
        So the overall time complexity is O(NlogN).

        Time complexity:    O(NlogN)

    Space complexity:   O(1)
 */
public class _9_Boats_to_save_people {
    public static void main(String[] args) {
        int[] people = { 3, 2, 2, 1 };
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }

    // imp     04 matrix multiplication and 2 pointers part 4
    private static int numRescueBoats(int[] people, int limit) {
        int start = 0;
        int end = people.length - 1;
        int res = 0;
        Arrays.sort(people);
        while (start <= end) {
            res++;
            // error :     it should not be == limit ,  it should be <= limit 
            //                                        as we are checking if the sum of start and end is less than or equal to limit
            if (people[start] + people[end] == limit) {
                start++;
            }
            end--;
        }

        return res;
    }
    /* 
        public static int numRescueBoats(int[] people, int limit) {
        // To perform two pointers we need the array to be sorted
        Arrays.sort(people);
        int weight = 0;
        int highestWeight = people.length - 1;
        int boats = 0;
        while (weight <= highestWeight) {
            int totalWeight = people[weight] + people[highestWeight];
            if (totalWeight <= limit) {
                weight++;
            } 
                boats++;
                highestWeight--;
        }
        return boats;
    }
     */
}

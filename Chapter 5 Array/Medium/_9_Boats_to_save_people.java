// Leetcode Q 881 boats to save people , Medium
// https://leetcode.com/problems/boats-to-save-people/
public class _9_Boats_to_save_people {
    public static void main(String[] args) {
        int[] people = { 3, 5, 3, 4 };
        int limit = 5;
        System.out.println(numRescueBoats(people, limit));
    }
// imp     04 matrix multiplication and 2 pointers part 4
    private static int numRescueBoats(int[] people, int limit) {
        int start = 0;
        int end = people.length - 1;
        int res = 0;
        while (start < end) {
            res++;
            if (people[start] + people[end] < limit) {
                start++;
            }
            end--;
        }
        return res;
    }
}

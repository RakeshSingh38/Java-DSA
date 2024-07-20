public class _3_Find_Smallest_Letter_Greater_Than_Target {
    // leetcode problem 744 Find Smallest Letter Greater Than Target
    // celing Question
    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j' };
        System.out.println(nextGreatestLetter(arr, 'c'));
    }

    /**
     * Finds the smallest letter in the given array that is greater than the target letter.
     *
     * @param letters the array of letters to search in
     * @param target the target letter to compare against
     * @return the smallest letter greater than the target, or the first letter if no such letter exists
     */
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // to return first element we can also write
        //if (start >= letters.length - 1)
        //            return letters[0];

        return letters[start % letters.length];

        // reference
        //        int start = 0;
        //        int end = letters.length - 1;
        //        while (start <= end) {
        //            int mid = start + (end - start) / 2;
        //            if (target >= letters[mid]) {
        //                start = mid + 1;
        //            } else {
        //                end = mid - 1;
        //            }
        //        }
        //        if (start >= letters.length - 1)
        //            return letters[0];
        //
        //        return letters[start];

    }

}
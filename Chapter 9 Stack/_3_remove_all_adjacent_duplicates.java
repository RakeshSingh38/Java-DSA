import java.util.Stack;

// Leetcode 1047. Remove All Adjacent Duplicates In String (Easy) 
// Given a string s consisting of lowercase English letters, a duplicate removal consists of choosing two adjacent and equal letters and removing them.
// We repeatedly make duplicate removals on s until we no longer can.

// url  : https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class _3_remove_all_adjacent_duplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        //System.out.println(removeDuplicates(s));
        //System.out.println(removeDuplicates2(s));
        System.out.println(removeDuplicates3(s));
    }

    /* // r         StringBuilder is slower than stack
    * The method uses a StringBuilder to iterate over the characters of the input string.
    * It compares each character with the last character in the StringBuilder.
    * If they are the same, it removes the last character from the StringBuilder.
    * If they are different, it appends the current character to the StringBuilder.
    * Finally, it returns the string representation of the StringBuilder.
    
    * This method has a time complexity of O(n), where n is the length of the input string.
    * It does not use any additional data structures apart from the StringBuilder.
    */
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            // if the current character is same as the last one in `sb`
            // then we cannot push it to `sb`
            // we remove the one in `sb`
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
                sb.deleteCharAt(sb.length() - 1);
            // otherwise, add the current character to `sb`
            else
                sb.append(c);
        }
        return sb.toString();
    }

    /**
    * This method uses a stack to keep track of characters and remove duplicates.
    *
    * @param s the input string consisting of lowercase English letters
    * @return a new string with all adjacent duplicates removed
    */
    public static String removeDuplicates2(String s) {
        Stack<Character> st = new Stack<>();

        // Iterate over each character in the input string
        for (char c : s.toCharArray()) {
            // If the stack is not empty and the top character is the same as the current character
            if (!st.isEmpty() && st.peek() == c) {
                // Remove the top character from the stack
                st.pop();
            } else {
                // Otherwise, push the current character onto the stack
                st.push(c);
            }
        }

        // Create a character array to store the result
        char[] arr = new char[st.size()];

        // Pop characters from the stack and store them in the array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        // Convert the character array to a string and return it
        return new String(arr);
    }

    /**  // r       More efficient solution 
    * It uses a two-pointer technique to achieve this in-place.
    *
    * @param s the input string consisting of lowercase English letters
    * @return a new string with all adjacent duplicates removed
    */
    public static String removeDuplicates3(String s) {
        // Convert the input string to a character array for in-place modification
        char[] chars = s.toCharArray();
        // Initialize a pointer to keep track of the position in the modified array
        int i = 0;

        // Iterate over each character in the input string
        for (int j = 0; j < chars.length; j++) {
            // If the current character is the same as the last character in the modified array
            if (i > 0 && chars[i - 1] == chars[j]) {
                // Remove the last character from the modified array by decrementing the pointer
                i--;
            } else {
                // Otherwise, add the current character to the modified array
                chars[i] = chars[j];
                // Increment the pointer to the next position in the modified array
                i++;
            }
        }

        // Convert the modified character array to a string and return it
        // Only include the characters up to the pointer position
        return new String(chars, 0, i);
    }

}

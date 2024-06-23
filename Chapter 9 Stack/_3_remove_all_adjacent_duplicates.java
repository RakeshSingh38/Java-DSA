import java.util.Stack;

public class _3_remove_all_adjacent_duplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

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

    public static String removeDuplicates2(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        char[] arr = new char[st.size()];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return new String(arr);
    }
}

import java.util.Stack;

public class _1_Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.peek());
        //System.out.println(st);
        String s = "adebbecaacded";
        String s1 = "abbbe";
        //String ans = removeAdjacent(s);
        System.out.println(removeAdjacent(s));
        System.out.println(removeAdjacent(s1));

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

    private static String removeAdjacent(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.size() == 0) {
                st.push(s.charAt(i));
                continue;
            }

            if (st.peek() == s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        char[] arr = new char[st.size()];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return new String(arr);
    }

}

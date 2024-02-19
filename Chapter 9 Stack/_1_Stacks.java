import java.util.Arrays;
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
        //System.out.println(st.peek());
        //System.out.println(st);
        String s = "adebbecaacded";
        String s1 = "abbbe";
        //String ans = removeAdjacent(s);
        System.out.println(removeAdjacent(s));
        System.out.println(removeAdjacent(s1));
    }

    private static String  removeAdjacent(String s) {
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
        return Arrays.toString(arr);
    }

}

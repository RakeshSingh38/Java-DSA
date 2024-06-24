// Leetcode Q #709  To Lower Case Easy
// https://leetcode.com/problems/to-lower-case/

public class _5_to_lower_case {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(toLowerCase(str));
    }

    private static String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        return new String(ch);

        // or

        //return str.toLowerCase();
    }
}

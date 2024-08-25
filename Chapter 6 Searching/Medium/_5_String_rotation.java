public class _5_String_rotation {

    // Leetcode Q : 796 String Rotation

    // given two strings, A and B, return true if A is a rotation of B. (A concatenated with itself is considered a rotation of B)

    // url : https://leetcode.com/problems/rotate-string/description/
    public static void main(String[] args) {
        String A = "ABCD";
        String B = "CDAB";
        boolean yesOrNo = isRotation(A, B);
        System.out.println(yesOrNo);
    }

    static boolean isRotation(String A, String B) {
        if (A.length() != B.length())
            return false;
        return (A + A).contains(B);
    }
}

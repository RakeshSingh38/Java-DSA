public class _5_String_rotation {
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

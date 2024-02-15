public class _7_5_Print_pattern_letters {
    public static void main(String[] args) {
        //        String stars = "A";
        //
        //        for (int i = 0; i <= stars.length(); i++) {
        //            for (int spaces = stars.length(); spaces <= 4; spaces--) {
        //                System.out.println(" ");
        //            }
        //            for (int j = 0; j < stars.length(); j++) {
        //                System.out.println(stars);
        //            }
        //            System.out.println();

        /* 
        _ _ _ _ A
        _ _ _ A B
        _ _ A B C
        _ A B C D
         */
        int n = 4;
        int space = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("_ ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            space--;
            System.out.println();
        }

    }
}

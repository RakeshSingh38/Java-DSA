//import java.util.Arrays;

public class _24_Exactly_three_letters_seperated_By {
    public static void main(String[] args) {
        // Q        CoderByte coding Q
        // for normal strings its .length()
        //String str = "Laura Sobs";
        String str = "Laura Sobs";
        //String str = "Laura Soabs";

        //System.out.println(str.length());
        //String[] s = { "a", "h" };

        // for array of strings its length 
        //System.out.println(s.length);
        System.out.println(exactlyThreeChar(str));

    }

    private static boolean exactlyThreeChar(String str) {
        for (int i = 1; i <= str.length(); i++) {
            // r        it says after 3 characters means charAt(i+4) coz if its asfeb then a is 0 and b is 4 so a+3 will resilt in e 
            //          but we want b so its a+4 

            // note     Things to note in Q they stated exactly after 3 letters means our answer will be in 4th spot
            // fix       i have to make sure that the value of i is under the str.length() to to prevent IndexoutOfBound
            if (i + 3 < str.length() && str.charAt(i) == 'a' && str.charAt(i + 4) == 'b')
                return true;
        }
        return false;
    }

    static int m(int[] arr) {
        int a = arr[0] = 0;

        return a;
    }
}

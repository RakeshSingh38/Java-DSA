
import java.util.*;

// imp         Program to reverse a string while maintaining the order of words. i.e., "the fox of" becomes "of fox the".
public class _18_Reverse_String_while_maintaining_order {

    public static void main(String[] args) {
        //System.out.println(reverseString("the fox of"));
        //

        String str = "the fox of";
        String[] words = str.split(" ");
        //System.out.println(Arrays.toString(words));
        StringBuilder reverseString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {

            // r        same as or
            //System.out.print(words[i] + " ");

            reverseString.append(words[i]);
            if (i != 0) {
                reverseString.append(" ");
            }
        }

    // or

    for(

    int i = words.length - 1;i>=0;i--)
    {
        //System.out.print(words[i] + " ");
    }
    System.out.println(reverseString);
    }

    @SuppressWarnings("un-used")
    static String reverseString(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);

    }
}

import java.util.HashSet;
import java.util.Set;

/**
 * temp1
 */
public class temp1 {

    public static void main(String[] args) {

        //String input = "Capabl";
        //int count = 0;
        //input = input.toLowerCase();
        //for (int i = 1; i < input.length(); i += 2) {
        //    char ch = input.charAt(i);
        //    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //        count++;
        //    }
        //}
        //System.out.println("Number of Vowels are " + count);

        // do above problem using set
        Set<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        int count = 0;
        String str = "Capabl";
        str = str.toLowerCase();
        for (int i = 1; i < str.length(); i += 2) {
            char ch = str.charAt(i);
            if (vowel.contains(ch)) {
                count++;
            }
        }
        System.out.println("Number of Vowels are " + count);

    }
}
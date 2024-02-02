import java.util.Scanner;

public class _10_Vowels_or_Consonants {
    static String checkVowelOrConsonant(char ch) {

        // imp     Vowels are a, e, i, o, u , Consonants are all other alphabets except vowels
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        String lowercaseCh = String.valueOf(Character.toLowerCase(ch));
        for (char vowel : vowels) {
            if (String.valueOf(vowel).equalsIgnoreCase(lowercaseCh)) {
                return "Vowel";
            }
        }
        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        System.out.println(checkVowelOrConsonant(character));
        scanner.close();
    }
}

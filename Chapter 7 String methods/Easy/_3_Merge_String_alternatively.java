// Leetcode Q  #1768  Merge Strings Alternately Easy
// https://leetcode.com/problems/merge-strings-alternately/

public class _3_Merge_String_alternatively {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        while (i < word1.length()) {
            sb.append(word1.charAt(i));
            i++;
        }
        while (i < word2.length()) {
            sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }
    //System.out.println(one);
    //System.out.println(two);
}

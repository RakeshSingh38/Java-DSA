import java.util.*;

public class _26_gfg_potd_remove_duplicates {
    public static void main(String[] args) {
        String str = "zvvo";
        System.out.println(RemoveDupli(str));
    }

    private static String RemoveDupli(String str) {
        Set<Character> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (set.contains(c))
                continue;



            // tip      This ensures that only unique characters are added to the set 
            set.add(c);

            // this add the character to the StringBuilder that are unique as they have not been encountered before i.e we are using sets
            sb.append(c);
        }

        //System.out.println(str);

        return sb.toString();
    }
}

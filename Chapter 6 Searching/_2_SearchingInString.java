// import java.lang.Iterable;

import java.util.Arrays;

public class _2_SearchingInString {

    public static void main(String[] args) {
        String name = "Rakesh";
        char target = 'e';
        // w         Don't use double quotes to write  char use single quotes only ❌❌❌
        // r      the above line is not case Sensitive (r and R is different) so R and r will produce different results ✅✅✅

        // System.out.println(SearchingInString(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println();
        System.out.println(SearchInString2(name,target));
    }

    static boolean SearchingInString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;

        // for (char indexString : str) {
        //     if(indexString==target){
        //         return true;
        //     }
    }


    static boolean SearchInString2(String str, char target){
        if(str.length()== 0){
            return false;
        }

        for (char ch : str.toCharArray()) {
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}

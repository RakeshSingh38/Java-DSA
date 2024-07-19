//package Chapter

import java.util.Arrays;

//7 String methods;

/*
*       This class demonstrates how to count the occurrences of the number 11 in an array of integers.
 */
public class _19_Count_eleven {
    public static void main(String[] args) {
        int[] count = { 1, 2, 3, 4, 11, 22, 11, 55, 11, 11 };

        // so as compared to Js what i have to do is 
        // 1>  store the .toString(count)  in an String variable
        // 2>  convert the string to character Array
        // 3>  use the charArray to navigate and rest i know
        String answer = Arrays.toString(count);
        System.out.println(answer);
        int ct = 0;
        char[] ans = answer.toCharArray();

        // imp      to check the data type of a variable do variableName..getClass().getSimpleName()
        System.out.println(ans.getClass().getSimpleName());
        // or
        System.out.println(ans instanceof char[]);
        for (int i = 0; i <= ans.length - 1; i++) {
            if (ans[i] == '1' && ans[i + 1] == '1') {
                ct++;
            }
        }

        System.out.println(ct);
    }
}

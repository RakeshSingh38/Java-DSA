import java.lang.System;

/**
 * _2_Roman_to_Integer
 */
public class _2_Roman_to_Integer {

    public static void main(String[] args) {
        // MCMXCIV
        //Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
        //                 1000 +     900 +     90 +        4 = 1994
        System.out.println(romanToInt("MCMXCIV")); // 1676
        //1476
    }

    public static int romanToInt(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'I':
                    ans += 1;
                    break;
                case 'V':
                    ans += 5;
                    break;
                case 'X':
                    ans += 10;
                    break;
                case 'L':
                    ans += 50;
                    break;
                case 'C':
                    ans += 100;
                    break;
                case 'D':
                    ans += 500;
                    break;
                case 'M':
                    ans += 1000;
                    break;
                default:
                    break;
            }
            //if (i > 0) {
            //    char prev = str.charAt(i - 1);
            //    if ((c == 'V' || c == 'X') && prev == 'I') {
            //        ans -= 2;
            //    } else if ((c == 'L' || c == 'C') && prev == 'X') {
            //        ans -= 20;
            //    } else if ((c == 'D' || c == 'M') && prev == 'C') {
            //        ans -= 200;
            //    }
            //}
            if (i > 0) {
                // MCMXCIV
                // Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
                // 1000 + 900 + 90 + 4 = 1994
                char prev = str.charAt(i - 1);
                /*
                I can be placed before V (5) and X (10) to make 4 and 9.
                X can be placed before L (50) and C (100) to make 40 and 90.
                C can be placed before D (500) and M (1000) to make 400 and 900.
                here placed before means  ( i - 1 )
                 */
                if ((c == 'V' || c == 'X') && prev == 'I') {
                    ans -= 2;
                } else if ((c == 'L' || c == 'C') && prev == 'X') {
                    ans -= 20;
                } else if ((c == 'D' || c == 'M') && prev == 'C') {
                    ans -= 200;
                }
            }
            /* 
            if (i < str.length() - 1) {
                if (str.charAt(i) == 'I' && str.charAt(i + 1) == 'V') {
                    ans -= 1;
                }
            }
             */
        }
        return ans;
    }
}
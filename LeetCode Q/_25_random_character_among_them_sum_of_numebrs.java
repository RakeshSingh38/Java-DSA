import java.util.*;

@SuppressWarnings("unused")

public class _25_random_character_among_them_sum_of_numebrs {
    // Q        Sum of consecutive numbers in a string of characters
    /* 
    Given an array of random characters, integers andsymbols, WAP to print the sum of the integers in the arrayand ignore the remaining characters. Considerconsecutive numbers as a single number
    
    // note     WAP here likely stands for "Write a Program".
    
    given input "@%^@123^$#4";
    
    output will be 123+4 = 127
     */
    public static void main(String[] args) {
        //String str = "@%^@123^$#4";
        //        str = str.replaceAll("[^0-9]", "");
        //        System.out.println(str);
        //        int n = Integer.parseInt(str);
        //        //System.out.println(n);
        //        int sum = 0;
        //        for (int i = 0; i < str.length(); i++) {
        //            if(str.charAt(i+1)==Number)
        //            
        //
        //            System.out.println(lastDigit);
        //        }
        //        System.out.println(sum);
        String str = "GSD#13xxU343%^DGF1@@";
        System.out.println(Sum_consecutive_numbers(str));
    }

    static int Sum_consecutive_numbers(String str) {
        str = str.replaceAll("[^0-9]", " ");
        // here all non-digit characters are replaced by a space
        System.out.println(str);

        // now i will trim the spaces and split the string into an array of numbers
        String[] numbers = str.trim().split("\\s+");
        //System.out.println(Arrays.toString(numbers));
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}

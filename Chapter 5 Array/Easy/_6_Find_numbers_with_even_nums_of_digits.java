// Leetcode 1295. Find Numbers with Even Number of Digits
public class _6_Find_numbers_with_even_nums_of_digits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
        double number = (int) Math.log10(12) + 1;
        System.out.println(number);

        System.out.println(digits(4535));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums)
            if (evenNumbers(num)) {
                count++;
            }
        return count;

        // one liner solution

        /*int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((int) ((Math.log10(nums[i])) + 1) % 2 == 0)
                result++;
        }
        return result;*/

    }

    static boolean evenNumbers(int num) {
        // ex 1764
        /* 
            1 > count the no. of digits
            count++
            n = n/10
            rg : 1764 = 176
                        17
                        1
                        0
        
                        2 > convert the no to a string
                        3 > take the length
        
                        */

        int numberOfDigits = digits(num);

        //if(numberOfDigits % 2 ==0) return true;

        // tip   shortcut is    ↓   boolean either gives true or false 

        return numberOfDigits % 2 == 0;
        // or   ( both are same)
        /*       // imp       convert number to string
        
        String str = Integer.toString(num);
        int numberOfDigits2 = str.length();
        
        return numberOfDigits2 % 2 == 0;    
         */
    }

    static int digits(int num) {
        // imp      it will make a number positive if its negative
        if (num < 0) {
            num = num * -1;
        }

        return (int) (Math.log10(num) + 1);
    }

    static int digits2(int num) {
        // imp      it will make a number positive if its negative
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0)
            return 1;

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}

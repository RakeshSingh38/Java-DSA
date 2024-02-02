public class _1_contains_even_no_of_digits_optimized_code {

    public static void main(String[] args) {
        int arr[] = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(arr));
        //System.out.println(digits(567));
        System.out.println(digits2(-567));
    }

    static public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums)
            if (evenNumbers(num))
                count++;

        return count;
    }

    // see      function to check whether no contains even no or not
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
    }

    // tip          i am iterating many times
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num) + 1);
    }

    //  count no of digits in a number
    static int digits(int num) {
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
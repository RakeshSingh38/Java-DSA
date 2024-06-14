public class _9_Palindrome_Number {
    // LeetCode Q 9 Palindrome Number
    public static void main(String[] args) {
        //System.out.println(PalindromeNumber(1121));
        //System.out.println(reverse(10));
        //reverse(10101);
        boolean result = isPalindrome(121);
        System.out.println(result);
    }

    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        //temp++;
        while (temp != 0) {
            // i have to go digit by digit so i will use the last digit
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            System.out.println("reverse is " + reverse);
            // once the work of last digit is done i will remove it so that it wont be
            // there in next loop
            temp = temp / 10;
        }
        // its either true or false
        return (reverse == n);
    }

    // imp      multiline comment
    /*  public static boolean PalindromeNumber(int x) {
        int number = x;
        int reverse = 0;
        if (number == x) {
            return true;
        } else if (number != x) {
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
                if (x < 0) {
                    return false;
                } else if (number == x && number > 0) {
                    return true;
                }
                if (reverse == number && reverse > 0) {
                    return true;
                }
            }
            System.out.print(reverse);
        }
    
        // else  return false;
        //if (PalindromeNumber(number) == reverse(number))
        //    return false;
        //else
        return true;
    }*/

    /* 
        int reverse = 0;
        int temp = n;
        //temp++;
        while (temp != 0) {
            // i have to go digit by digit so i will use the last digit
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            // once the work of last digit is done i will remove it so that it wont be
            // there in next loop
            temp = temp / 10;
        }
        // its either true or false
        return (reverse == n);
     */
}

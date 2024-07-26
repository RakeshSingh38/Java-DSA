// LeetCode 1281. Subtract the Product and Sum of Digits of an Integer
// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
// Example 1:
// Input: n = 234
// Output: 15
public class _1_Subtract_product_minus_sum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            product *= lastDigit;
            n = n / 10;
        }
        return product - sum;
    }
}

/* // imp       With recursion can be written as
    public int subtractProductAndSum(int n) {
        return helper(n,1,0);
    }
    private int helper(int n, int product, int sum){
        if(n==0){
            return product-sum;
        }
        else{
            int digit = n %10;
            return helper(n/10,product*digit, sum+digit);
        }
    }
 */

// LeetCode: Q 1523 : Count Odd Numbers in an Interval Range
// Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
// link : https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/ 
public class _4_Count_odds {
    public static void main(String[] args) {
        System.out.println(countOdds(8, 10) + " ans");
        System.out.println(countOdds(3, 7) + " ans");
        System.out.println(countOdds(0, 1000000000) + " ans");
        System.out.println(countOdds(0, 10) + " ans");
    }

    public static int countOdds(int low, int high) {
         //  If Both low and high are Odd then Simply (high-low)/2 + 1
        //  If Both are Even then (high-low)/2
        //  If Both are combo of each other then we do (high-low)/2 + 1
        int oddNum = (high - low) /2;
            if (low % 2 == 0 && high %2==0 ){
                return oddNum;
            } 
        return oddNum+1;
    }
}

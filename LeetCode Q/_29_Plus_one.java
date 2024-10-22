import java.util.Arrays;

public class _29_Plus_one {

    // Q        LeetCode no. 66 Plus one
    // plus One : Given a non-empty array of digits representing a non-negative integer, plus one to the integer and return the resulting array. Each digit in the input array represents a digit of the input number.
    // url   https://leetcode.com/problems/plus-one/      

    public static void main(String[] args) {
        //String[] input = { "1", "2", "3" };
        String[] input = { "9", "9", "9" };
        int[] arr = { 9, 9, 9 };

        // tip      To print Contents of int[] function we need to use Arrays.toString() function
        System.out.println(Arrays.toString(plusOne(arr)));

        //Arrays.toString(input);
        PlusOne_Using_string(input);
    }

    // r        Optimized Solution

    // TC and SC  O(n)
    public static int[] plusOne(int[] arr) {
        int n = arr.length;

        // imp    TC and SC O (N)
        for (int i = n - 1; i >= 0; i--) {

            // if less than 9
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            // for condition 9
            arr[i] = 0;
        }

        // see       if digits is 9 then make a new array with n+1 and make the 1st element as 1
        // coz rest will be 0
        int[] newArr = new int[n + 1];
        newArr[0] = 1;

        // see       to View the contents of int[] arr input we need to use Arrays.toString
        // otherwise the output using SOP is [I@4517d9a3]
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    static void PlusOne_Using_string(String[] input) {
        int carry = 1;
        for (int i = input.length - 1; i >= 0; i--) {
            int sum = Integer.parseInt(input[i]) + carry;
            if (sum == 10) {
                input[i] = "0";
                carry = 1;
            } else {
                input[i] = Integer.toString(sum);
                carry = 0;
                break;
            }
        }

        if (carry == 1) {
            System.out.print("1 ");
        }
        System.out.println(Arrays.toString(input));
    }

}
/*import java.util.Arrays;


public class temppp {
    public static void main(String[] args) {
        String[] input = { "1", "2", "3" };

        int number = 0;
        for (int i = 0; i < input.length; i++) {
            number = number * 10 + Integer.parseInt(input[i]);
        }
        number += 1;

        String result = Integer.toString(number);
        String[] output = result.split("");
        System.out.println(Arrays.toString(output));

        //number += 1;
        //System.out.println(number);
        //for (int i = 0; i < input.length; i++) {
        //    if (input[0].equals("9")) {
        //        input[0] += 1;
        //    }
        //}

        //        String result = Integer.toString(number);
        //        int[] arr = new int[result.length()];
        //
        //        for (int i = 0; i < result.length(); i++) {
        //            arr[i] = result.charAt(i) - '0';
        //        }

        //System.out.println(Arrays.toString(arr));
    }
}*/
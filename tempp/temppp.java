import java.util.Arrays;

// Q        LeetCode no. 66 Plus one
// plus One : Given a non-empty array of digits representing a non-negative integer, plus one to the integer and return the resulting array. Each digit in the input array represents a digit of the input number.
// url   https://leetcode.com/problems/plus-one/      

public class temppp {
    public static void main(String[] args) {
        //String[] input = { "1", "2", "3" };
        String[] input = { "9", "9", "9" };
        int[] arr = { 9, 9, 9 };

        System.out.println(Arrays.toString(plusOne(arr)));

        //Arrays.toString(input);
        PlusOne_Using_string(input);
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

    public static int[] plusOne(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] newArr = new int[n + 1];
        newArr[0] = 1;

        //System.out.println(Arrays.toString(newArr));
        return newArr;
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
import java.util.*;
import java.util.Stack;

// Leetcode 344 Reverse String Easy
// https://leetcode.com/problems/reverse-string/
// Given a character array s, reverse the order of the characters.

// Approach  Two pointer approach efficient 
public class _16_Reverse_String_using_stack {
    public static void main(String[] args) {
        char[] str = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println("Original String");

        // tip      if u want to check the type of array use instanceof but respect the data type
        //              eg if its argument is char[] then use char[] not char
        //                   ↓ ↓
        if (str instanceof char[]) {
            System.out.println("True");
        }

        // r        there are 3 ways to print the char array

        // This method is specific to char arrays. It converts the char array to a String.
        System.out.println(new String(str));

        System.out.println(Arrays.toString(str));
        System.out.println(str);
        //reverseString(str);
        reverseUsingTwoPointer(str);
        //for (char i = 0; i < str.length; i++) {
        //}
        System.out.println("\nNew String String");
        System.out.println(new String(str));
        //System.out.println(Arrays.toString(str));
        //System.out.println(Arrays.toString(str));
    }

    @SuppressWarnings("unused")
    private static void reverseString(char[] str) {
        Stack<Character> stack = new Stack<>();
        for (char i = 0; i < str.length; i++) {
            stack.push(str[i]);
        }

        for (int i = 0; i < str.length; i++) {
            if (!stack.isEmpty()) {
                str[i] = stack.peek();
                stack.pop();
            }
        }
        //for (int i = 0; i < str.length; i++) {
        //    if(!stack.isEmpty()){
        //        System.out.println(stack);
        //        stack.pop();
        //    }
        //}
    }

    public static void reverse(char[] c) {
        for (int i = c.length - 1; i >= 0; i--) {
            Character.toString(c[i]);
        }

        //        for (int i = c.length - 1; i >= 0; i--) {
        //            System.out.print(c[i] + " ");
        //
        //        }
    }

    public static void reverseUsingTwoPointer(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

    }

}

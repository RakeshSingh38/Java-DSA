import java.util.*;


public class _17_Ways_to_print_Strings {

    public static void main(String[] args) {
        char[] str = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println("Original String");

        // tip      if u want to check the type of array use instanceof but respect the data type
        //              eg if its argument is char[] then use char[] not char
        //                   ↓ ↓
        if (str instanceof char[]) {
            System.out.println("True");
        }

        // r        there are 3 ways to print the char array ( new String is most efficient)

        // imp      most efficient way to print the char array , as it  directly converts the char array to a String in a single step, which is optimized for this specific purpose.

        // This method is specific to char arrays. It converts the char array to a String.
        System.out.println(new String(str));

        // r        This method works for any type of array. It converts the array to a string representation.
        System.out.println(Arrays.toString(str));

        // r        Using StringBuilder to build a string representation of the array
        StringBuilder sb = new StringBuilder();
        for (char c : str) {
            sb.append(c);
        }
        System.out.println("StringBuilder");
        System.out.println(new String(sb));

        //reverseString(str);
        //reverseUsingTwoPointer(str);
        //for (char i = 0; i < str.length; i++) {
        //}
        System.out.println("\nNew String String");
        System.out.println(new String(str));
        //System.out.println(Arrays.toString(str));
        //System.out.println(Arrays.toString(str));
    }

}

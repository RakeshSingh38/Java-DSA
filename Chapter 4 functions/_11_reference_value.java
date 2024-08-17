import java.util.Arrays;

/* 
    Summary:
    when passing an array to a method or function in Java or C++, you are passing a reference to the array. This means that when you modify the array inside the method, it will also affect the original array.
    The main difference between Java and C++ is the way arrays are passed to methods. In Java, arrays are passed by reference, while in C++, arrays are passed by decaying to a pointer. Here's a comparison:

    Java: Use int[] nums to pass an array to a method. The array is passed by reference.
    C++: Use int* nums to pass an array to a function. The array decays to a pointer, allowing you to modify the original array.
    Both approaches allow you to modify the original array, but the syntax and underlying mechanisms differ between Java and C++.


    // r        difference between Java and C++ references and pointers
    Java: Use int[] nums to pass an array to a method. The array is passed by reference.
    C++: Use int* nums to pass an array to a function. The array decays to a pointer, allowing you to modify the original array.


    Both approaches allow you to modify the original array, but the syntax and underlying mechanisms differ between Java and C++.
 */
public class _11_reference_value {

    public static void main(String[] args) {
        // creating an array
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        changeValue(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changeValue(int[] nums) {
        nums[0] = 55;
        // r     here we are changing the value via ref variable so the same variable is gonna change 

    }

}
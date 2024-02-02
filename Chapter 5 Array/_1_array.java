// see      Advantages
// Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
// Random access: We can get any data located at an index position.

// see      Disadvantages
// Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime.
// To solve this problem, collection framework is used in Java which grows automatically.

import java.util.Arrays;

public class _1_array {
    public static void main(String[] args) {

        // see different ways to declare arrays , watch carefully

        int[] array = { 21, 2 };
        // imp     it gives only Address of the array when called like thiss  
        //                                       ↓
        System.out.println(array);

        int array1[] = { 32, 6 };
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        // There are two types of array.

        // → Single Dimensional Array
        // → Multidimensional Array

        // → Single Dimensional Array
        // ↓

        String[] names = { "Shri", "Rakesh ", "Singh " };
        System.out.println("Accessing 0th index " + names[0]);

        // I loop through an array using forEach method
        for (String name : names) {
            System.out.println(name);
        }
        // imp    To change the value of a specific element, we refer to the index number
        names[0] = "60";
        System.out.println("Accessing 0th index after changes " + names[0]);

        // imp     to get length of a array use length property

        System.out.println("Length of array is " + names.length);
    }
}

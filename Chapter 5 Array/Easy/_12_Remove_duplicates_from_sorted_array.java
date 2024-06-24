import java.util.Arrays;
import java.util.LinkedHashMap;

public class _12_Remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6 };
        //System.out.println(1!=2);
        //System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicatesOriginal(arr));
    }

    public static int removeDuplicates(int[] arr) {
        // Create a LinkedHashMap to store unique elements
        LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<>();

        // Add all elements of the array to the LinkedHashMap
        for (int num : arr) {
            map.putIfAbsent(num, true);
        }

        // Clear the input array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        // Copy the unique elements from the LinkedHashMap to the input array
        int index = 0;
        for (int num : map.keySet()) {
            arr[index++] = num;
        }

        // Return the new length of the modified array
        return map.size();
    } // ok so this isnt so this

    public static int removeDuplicatesOriginal(int[] arr) {
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
        // You can print the array using Arrays.toString(arr) or Arrays.copyOf(arr, index) 
        System.out.println(Arrays.toString(Arrays.copyOf(arr, index)));
        // or 
        //Arrays.stream(arr, 0, index).forEach(num -> System.out.print(num + " "));
        return index;
    }
}

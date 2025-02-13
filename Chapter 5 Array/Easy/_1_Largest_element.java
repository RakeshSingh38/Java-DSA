
//  1. Largest element in array

public class _1_Largest_element {
    public static void main(String[] args) {
        //int[] arr = { 7, 6, 1, 9, 5, 1, 5 };
        //int[] arr = { 1, 2, 4, 7, 7, 5 };
        int[] arr = { 1, 2, 3, 4, 5 };
        //System.out.println(Arrays.toString(arr));
        System.out.print("largest is = " + largestElement(arr, 3));
        //Arrays.sort(arr);
    }

    static int largestElement(int[] arr, int n) {
        //int largest = arr[0];
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                // imp       main logic
                largest = arr[i];
            }
        }
        //System.out.println(temp);
        //System.out.print("largest is " + largest);
        return largest;
    }
}

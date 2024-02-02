public class _2_7_Remove_even_numbers {
    public static void main(String[] args) {
        int[] arr = { 1,2,5,6,8,9 };
        //int n = arr.length - 1;
        //printArray(arr);
        //int[] result = removeEven(arr);
        // as the removeEven method returns an array we need to store it in an array
        System.out.println();
        System.out.print("Original array :           ");
        printArray(arr);

        int[] result = removeEven(arr);
        System.out.println();
        System.out.print("even numbers removed  :    ");
        printArray(result);
        System.out.println();
    }

    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // imp      it put 0 to all the even numbers
    //    static void removeEven(int[] k, int n) {
    //        int counter = 0;
    //        for (int i = 0; i < n; i++) 
    //
    //            if (k[i] % 2 == 1)
    //                k[counter++] = k[i];
    //        
    //        for (int i = counter; i < n; i++) 
    //
    //            k[i] = 0;
    //        //return counter;
    //    }

    public static int[] removeEven(int[] array) {
        int oddCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCounter++;
            }
        }

        int[] result = new int[oddCounter];
        int index = 0;
        // fix       i wrote result.length instead of array.length 😅
        // thats why i was getting the 0's in the output
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                //System.out.print(" " + array[i]);
                result[index] = array[i];
                index++;
            }

        }
        System.out.print("\nCounter is " + oddCounter);
        System.out.println();
        return result;

    }
}

public class _2_6_Reverse_array {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 4, 6, 4 };

        System.out.println("Original Array : ");
        printArray(arr);

        reverseArray(arr,0,arr.length-1);
        System.out.println("Reversed Array : ");
        printArray(arr);

        // r        can also be written as this :
        //      the below code makes an instance of the class and calls the method
        //      still i get the error as the value of local variable is not used
        //   u can comment below line and the error will be solved
        //_2_6_Reverse_array array = new _2_6_Reverse_array();

        //_2_6_Reverse_array.printArray(new int[] { 5, 7, 3, 2, 5, 3 });

    }

    static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

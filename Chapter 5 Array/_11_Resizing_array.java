public class _11_Resizing_array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        //_11_Print_SubArrays arr2 = new _11_Print_SubArrays();
        //arr2.[0]=21;
        System.out.println("\nBefore resizing\n" + arr.length);
        //printArray(arr);
        System.out.println();
        System.out.println("");
        int[] ans = resize(arr, 12);
        System.out.println(ans.length);

        System.out.println("\nAfter resizing\n" + arr.length);
        //printArray(arr);
        System.out.println();
        System.out.println();
        // print table of 5
        int[] table = new int[10];
        for (int i = 1; i <= table.length; i++) {
            //table[i] = 5 * (i + 1);
            System.out.println("5 X " + (i) + "   =  " + i * 5);
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
}

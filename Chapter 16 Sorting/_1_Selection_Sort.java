import java.util.Arrays;

public class _1_Selection_Sort {
    public static void main(String[] args) {
        //int[] arr = { 1, 4, 3, 5, 7, 2 };
        int[] arr = { 10, 4, 3, 2, 8 };

        System.out.println("Original");

        System.out.println(Arrays.toString(arr));
        //System.out.println();
        System.out.println(Arrays.toString(SelectionSort(arr)));
        //System.out.println(Arrays.toString(SelectionSortHigh(arr)));

        // test     working  ✅✅✅
        //System.out.println(Arrays.toString(SelectionSortHighBackup(arr)));

        //System.out.println(arr[arr.length-2]);
    }

    static int[] SelectionSort(int[] arr) {
        //int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(arr[j] + " < " + arr[index] + " ");
                if (arr[j] < arr[index]) {
                    index = j; // here we are storing the index of the smallest value
                }
            }
            swap(arr, i, index);
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("FUnction");
        //System.out.println(Arrays.toString(arr));
        return arr;
    }

    static int[] SelectionSortHigh(int[] arr) {
        //int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            //int index = i;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1])
                    //index = j;
                    swap(arr, i, j + 1);
            }
        }
        System.out.println("FUnction");
        //System.out.println(Arrays.toString(arr));
        return arr;
    }

    static int[] SelectionSortHighTemp(int[] arr) {
        //int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            int min = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        System.out.println("FUnction");
        //System.out.println(Arrays.toString(arr));
        return arr;
    }

    // test         working  ✅✅✅
    static int[] SelectionSortHighBackup(int[] arr) {
        //int index = 0;
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            int index = i;
            //System.out.println(index);
            for (int j = i - 1; j >= 0; j--) {
                //System.out.println(j);
                System.out.print(index + " < " + j + " ");
                // imp      if we found that index is greater than j then we will update the index
                if (arr[index] < arr[j]) {
                    index = j;
                }
                // and then we will repeat the process once this inner loop ends we will get the index of the largest value to swap with
                // i.e index < j 
            }
            swap(arr, i, index);
            System.out.println(Arrays.toString(arr));

        }
        System.out.println("FUnction");
        //System.out.println(Arrays.toString(arr));
        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

public class _4_linearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 5, 3, 56 };
        //printArray(arr);
        int index = findArray(arr, 3);
        //System.out.println(index);
        //printArray(arr);
        if (index ==-1) {
            System.out.println("key is not found");
        }
        else{
            System.out.println("Key is found at index "+index);
        }
    }





    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    static int findArray(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        printArray(arr);
        return -1;
    }
}

public class practise2 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 7 };

        //System.out.println(array.length);

        // imp    as array have a fixed size it wont overide it like this ↓
        //array[6] = 99;

        // imp    to Acess last element of an array use arrayName[arrayName.length - 1]
        System.out.println(array[array.length - 1]);
        // r        it wont work as i already declared a sop there
        System.out.println("");
        printArray(array);
    }

    static void printArray(int[] arr) {
        // simplyfying the code
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void printArray2(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}

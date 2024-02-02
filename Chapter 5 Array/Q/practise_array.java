public class practise_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 9, 6, 4 };
        System.out.println();
        printArray(arr);
        System.out.println();

        // fix it wont work like this as the method returns an array so i need to store it in array
        int[] result = removeEvenArray(arr);
        printArray(result); // ✅
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    static int[] removeEvenArray(int[] arr) {
        int oddCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCounter++;
            }
        }
        System.out.println(oddCounter);

        // now i will create new array to store values of oddCounter
        // i cant use previous array as its occupied

        int[] result = new int[oddCounter];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}

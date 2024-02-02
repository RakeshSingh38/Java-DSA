public class Two_pointers {
    public static void main(String[] args) {
        // program to understand two pointers
        int[] arr = { 2, 4, 5, 6, 23, 1, 6 };

        //printArray(arr);

        //System.out.println("Minimum number is " + findMinimum(arr));
        System.out.println("Minimum number is " + solve(arr));
        //printArray(arr);

    }

    static int findMinimum(int[] arr) {
        int min = arr[0];

        // for maximum
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                // for maximum
                //if (arr[i] > max) {

                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //System.out.println(min);

        // i need to print it so i will use sop in main function
        //System.out.println(max);
        return min + max;
    }

    static int solve(int[] A) {
        int min = 0;

        // for maximum
        int max = 0;

        for (int i : A) {
            if (i < min) {
                // for maximum
                //if (i > max) {

                min = i;
            }

            if (i > max) {
                max = i;
            }
        }
        return min + max;
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}

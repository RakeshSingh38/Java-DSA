public class _6_print_subArrays {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 7, 8, 9 };
        printSubArrays(arr);
    }

    // total pairs is given n(n-1)   :  in my case its 6( 6 + 1 )  ( Arithmetic progression )
    //                      ------                     ----------                                      
    //                        2                             2    =   42 / 2 = 21
    //    
    static void printSubArrays(int[] arr) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(" " + arr[k] + " ");
                }
                totalPairs++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(totalPairs);
    }
}
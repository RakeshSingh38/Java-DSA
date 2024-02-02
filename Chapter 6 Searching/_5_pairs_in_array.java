public class _5_pairs_in_array {
    static void pairsOfArray(int[] arr) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + "" + arr[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println(totalPairs);
    }
    // total pairs is given n(n-1)   :  in my case its 5( 5 - 1 )  ( Arithmetic progression )
    //                      ------                     ----------                                      
    //                        2                             2    =   20 / 2 = 10
    //                                                          


    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 7, 8 };
        System.out.println();
        pairsOfArray(arr);
    }
}

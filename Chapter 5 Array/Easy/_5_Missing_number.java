
public class _5_Missing_number {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 2, 4 };
        System.out.println(missingNumber(arr));
    }

    // XOR
    // we know that a^a = 0
    // and a^0 = a
    // so we will xor all the elements of the array with the index of the array
    // and the missing number will be left
    public static int missingNumber(int[] arr) {
        int res = arr.length;

        for (int i = 0; i < arr.length; i++) {
            res = res ^ i ^ arr[i];
        }

        return res;
    }

    // brute force approach
    /*    public static int missingNumber(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == count) {
                count++;
                //1
                //
            }
        }
        return count;
    }*/

}

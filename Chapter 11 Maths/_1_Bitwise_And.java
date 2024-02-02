
// Q       To find unique number in an array where all numbers  are present twice
public class _1_Bitwise_And {
    public static void main(String[] args) {
        //System.out.println(1 ^ 1);
        //System.out.println(isOdd(68));
        int[] arr = { 1, 2, 3, 4, 5 };
        //for (int i = 1; i <= arr.length; i++) {
        //    //System.out.println(" " + i + " " + isOdd(i));
        //}
        System.out.println(isUnique(arr));
        //System.out.println(2 | 3);
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    static int isUnique(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            //int n = arr[i];
            //unique %= 3;
            unique = unique ^ arr[i];
            System.out.print(" " + unique + "");
        }
        return unique;
    }
}

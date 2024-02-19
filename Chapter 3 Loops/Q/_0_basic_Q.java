
public class _0_basic_Q {
    public static void main(String[] args) {
        //int i = 5;
        //if (i <= 10) {
        //    //System.out.println(i);
        //    i = i * 2;
        //}
        //int i = 1;
        //while (i < 5) {
        //    System.out.print(i + " ");
        //    i = i + 2;
        //}
        int[] arr = { 1, 2, 3, 4, 5 };
        // print the elements of the array in reverse order using decrementing for loop

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        // imp     we can reverse the number using for loop and % 10
        // reverse a number using for loop and % 10
        int num = 12345;
        int lastDigit = 0;
        for (int i = num; i > 0; i = i / 10) {
            lastDigit = i % 10;
            System.out.print(lastDigit+" ");

        }
        System.out.println();
    }
}

import java.util.Arrays;

public class _1_Factorial {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] ans = SecondlargestElement(a);
        for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i]);
        }
        System.out.println("\nSecond Smallest is "+Arrays.toString(ans) );
    }
    
    static int[] SecondlargestElement(int[] a) {
        int largest = a[0];
        int secondLargest = -1;
        for (int i = 0; i < a.length; i++) {
            //  to find second largest
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }
        //System.out.println(largest);
        return new int[] { secondLargest };
    }
}

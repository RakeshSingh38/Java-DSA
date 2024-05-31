import java.util.Arrays;

public class _2_Second_largest {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = a.length;
        int[] ans = SecondlargestElement(a, n);
        System.out.print("Second Largest is "+Arrays.toString(ans) + "\nSecond Smallest is ");

        System.out.print(Arrays.toString(secondSmallest(a, n)));
    }

    static int[] SecondlargestElement(int[] a, int n) {
        int largest = a[0];
        int secondLargest = -1;
        for (int i = 0; i < a.length; i++) {
            //  to find second largest
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } 
            else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }
        //System.out.println(largest);
        return new int[] { secondLargest };
    }

    static int[] secondSmallest(int[] a, int n) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = a[0];
        for (int i = 0; i < a.length; i++) {
            //     to find second smallest
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } 
            else if (a[i] < secondSmallest && a[i] != smallest) {
                secondSmallest = a[i];
            }
        }
        return new int[] { secondSmallest };
    }
}

// r        bad approach time complexity is O(n^3)

// tip     optimize approach is prefix approach

public class _12_Maximum_SubArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        printSubArrays(arr);
    }

    private static void printSubArrays(int[] arr) {
        //int[] temp = arr;
        //int total = 0;
        int size = arr.length;
        int sum = 0;
        int sumMax = Integer.MIN_VALUE;
        int sumMin = 0;
        for (int i = 0; i < size; i++) {
            //sumMax = arr[i];
            int start = i;
            //System.out.print("start is "+start+" ");
            for (int j = i; j < size; j++) {
                //sumMin = arr[j];
                int end = j;
                //System.out.print("end is "+end+" ");
                sumMin = arr[i];
                // imp      i can eliminate k loop its only taken for reference 
                sum += arr[i];
                for (int k = start; k <= end; k++) {

                    //System.out.print(arr[k] + " ");

                }
                if (sum > sumMax) {
                    sumMax = sum;
                }
                //if (sum > sumMax) {
                //    sumMax = sum;
                //}

                //System.out.println();
                if (sum < sumMin) {
                    sumMin = sum;
                    //System.out.println(sumMin);
                }
                //System.out.print("\nMax Sum is " + sumMax + " ");
                //System.out.print("Min Sum is " + sumMin + " \n");

                //if (sum > arr[i]) {
                //    sumMax = arr[i];
                //    System.out.print(" Max is " + sumMax + " ");
                //    //System.out.println(sumMax);
                //}
                //if (arr[j] > sum) {
                //    sumMin = arr[j];
                //    System.out.print("Min is " + sumMin + " ");
                //}

                //total++;
                System.out.print("\nSum is " + sum);
                System.out.print("\nMin Sum is " + sumMin + " \n");

            }

            //System.out.println();
        }
        System.out.print("\nMax Sum is " + sumMax + " \n");
        System.out.print("Min Sum is " + sumMin + " \n");
        //System.out.println("Sum is " + sum);
        System.out.println();
        //System.out.println("Total is " + total);
    }
}

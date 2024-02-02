// binary search requires sorted array
// Eg : dictionary its an sorted way to describe words
// we go alphabatically

//import java.util.Arrays;

import java.util.Arrays;

public class _4_0_Binary_Search {

    public static void main(String[] args) {
        int[] arr = { 23, 5, 6, 12, 67, 65 };
        //int[] arr = { 5 6 12 23 65 67 };
        //sorted(arr);
        Arrays.sort(arr);
        //reverseArray(arr);
        System.out.println();
        System.out.println("Index found at " + findingBinarySearch(arr, 12));
        printList(arr);
        System.out.println("| |  |  |  |  |");
        System.out.println("0 1  2  3  4  5");
        System.out.println();
    }

    static int findingBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //int mid = (start + end) / 2;
            // below line is to avoid overflow
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    } 

    public static void printList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } 
        System.out.println(); 
    }

    static int sorted2(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
        }
        System.out.println();
        return 0;
    }

    static int sorted(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
        }
        return 0;
    }

    static void reverseArray(int[] arr) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

}

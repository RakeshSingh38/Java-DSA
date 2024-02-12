import java.util.Scanner;

public class _6_count_greater_than_itself {
    public static void main(String[] args) {
        //int[] arr = { -3, 10, 11, 4, 5, 6, 7, 3, 7, 5, 11 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Length is " + n);
        int ans = countGreater(arr);
        System.err.println(ans);
        sc.close();
    }

    static int countGreater(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                // update max
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                // or
                //if(arr[i]==max)
                count++;
            }
        }
        return count;
        // return arr.length-count   // or
    }
}

/*  // HackerRank submission
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("Length is " + n);
        int ans = countGreater(arr);
        System.out.println(ans);
    }

    static int countGreater(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                // update max
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                count++;
            }
        }
        return count;
    }
}
 */
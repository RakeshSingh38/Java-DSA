//import java.util.Arrays;

import java.util.Scanner;

public class _3_Printing_2d_arrays {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        //System.out.println(Arrays.deepToString(arr));
        Scanner sc = new Scanner(System.in);
        //System.out.println("Printing 2D array using for loop\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //arr[i][j] = sc.nextInt();
            }
            //System.out.println();
        }

        System.out.println("\nPrinting 2D array using for-each loop\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        print2dArrays(arr, 9);
        //System.out.println(arr.length);
        System.out.println();
        System.out.print(arr[0].length+" ");
        System.out.print(arr[1].length+" ");
        System.out.print(arr[2].length+" ");
        sc.close();
    }

    static boolean print2dArrays(int arr[][], int key) {
        // to found key if it is present in the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    //System.out.println("Key is present at index " + i + " " + j);
                    System.out.println("Key is present at index " + i + " " + j);
                    return true;
                }
                //System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return false;
    }
}

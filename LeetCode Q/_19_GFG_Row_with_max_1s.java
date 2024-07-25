//package com.example;

import java.util.*;

@SuppressWarnings("unused")

// Q        GFG Row with max 1s - Easy
//          https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
//      Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

public class _19_GFG_Row_with_max_1s {
    public static void main(String[] args) {
        //int[][] arr = { { 0, 0, 0, 0 } };
        int[][] arr = {
                { 0, 0, 0, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 1, 1, 1, 1 }
        };

        //System.out.println(rowMaxTest(arr));
        //System.out.println(rowMaxTest(arr));

        // optimized solution
        System.out.println(rowWithMax1s(arr));

        // Better solution
        //System.out.println(rowMaxTestBetter(arr));

        // test             
        //System.out.println(RowNoTest(arr));
    }

    // r        Optimze Solution
    static int rowWithMax1s(int[][] arr) {
        int maxRowIndex = -1;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            // integrated the // test   solution here
            if (arr[i][0] == 1) {
                //return row;
                return i;
            } else {

                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 1) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxRowIndex = i;
                }
                // this is the outer loop thats why the value of count is getting all at once
                //System.out.println(count);
            }
        }
        return maxRowIndex;
    }

    // test     
    static int RowNoTest(int[][] arr) {
        int row = 0;
        for (row = 0; row < arr.length; row++) {
            // here each row is sorted so if i can find first 1in 0th index then we return row
            //If the first element of the row arr[row][0] is 1, return the current row index row.
            if (arr[row][0] == 1) {
                //return row;
                return row;
            }
        }
        return -1;
    }

    static int rowMaxTest(int[][] arr) {
        int maxRowIndex = -1;
        int maxCount = 0;
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
                res[i] = count;
                //if (res[i] > maxCount) {
                //    maxCount = res[i];
                //    maxRowIndex = i;
                //}
            }
            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }

            // this is the outer loop thats why the value of count is getting all at once
            //System.out.println(count);
        }

        // imp      to find max E of an array using streams 
        //int maxE = Arrays.stream(res).max().getAsInt();
        //System.out.println("Max E: " + maxE);
        //return res;

        // or we can use Collections 

        // Find the maximum value's index in the res array using built-in function
        /*  OptionalInt maxE = Arrays.stream(res).max();
        if (maxE.isPresent() && maxE.getAsInt() > 0) {
            // Find the index of the maximum value
            int maxIndex = java.util.stream.IntStream.range(0, res.length)
                    .filter(i -> res[i] == maxE.getAsInt())
                    .findFirst()
                    .orElse(-1);
        
            //System.out.println("Max E: " + maxE.getAsInt() + ", Index: " + maxIndex);
            return maxIndex;
        }*/
        return maxRowIndex != -1 ? maxRowIndex : -1;
        //return -1;
    }

    static int rowMaxTestBetter(int[][] arr) {
        int maxRowIndex = -1;
        int maxCount = 0;
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
                res[i] = count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }
        }
        return maxRowIndex != -1 ? maxRowIndex : -1;
    }

    /* static int rowWithMax1s(int[][] arr) {
         int max = Integer.MIN_VALUE;
         int index = 0;
         //int res[] = new int[arr.length];
         for (int i = 0; i < arr.length; i++) {
             int count = 0;
             //int ans = 0;
             //ount = 0;
             for (int j = 0; j < arr.length; j++) {
                 if (arr[i][j] == 1) {
                     count++;
                 }
                 //System.out.println(count);
                 //System.out.println(res[i]);
                 //                max += count;
                 //if (arr[i][j] > max) {
                 //    max = arr[i][j];
                 //}
                 //System.out.println(max+" max");
                 //res[i] += count;
                 //res[i] += count;
                 //if (res[i] > max) {
                 //    max = res[i];
                 //}
                 //System.out.println(Math.max(res[i], max));
                 //System.out.println(Arrays.toString(res));
                 //temp += res[i];
             }
             //System.out.println(Arrays.toString(res));
             //System.out.println(count);
             if (count > max) {
                 max = count;
                 index = i;
             }
             //int test = Math.max(count, max);
             //System.out.println(test);
             //if(count>max)
             //System.out.println(count);
         }
         //System.out.println(max);
         System.out.println(index);
         return index;
     }*/

}

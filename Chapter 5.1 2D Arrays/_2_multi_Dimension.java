import java.util.Arrays;

public class _2_multi_Dimension {
    // ->     an array of arrays
    // imp   A multidimensional array is an array of arrays.

    //      Multidimensional arrays are useful when you want to store data as a tabular form,
    //      like a table with rows and columns.

    //      To create a two-dimensional array, add each array within its own set of curly braces:

    public static void main(String[] args) {
        int[][] numbers = { { 1, 2, 3, 4, 5 }, { 10, 9, 8, 7, 6 } };
        //                           |                |
        //                           ↓                ↓    
        System.out.println(numbers[0][4]);
        //                           ↓                | 
        //            It means 1st array , there      |    are two arrays 0 and 1
        //      As index starts from 0 so its 1st     |    and 1 is 2nd index
        //                                            ↓
        // r               It means access the 5th index from 1st array

        System.out.println(numbers[1]            [1]);
        //                           ↑              ↑
        //                           |              |
        //                       it means give 2nd index from 2nd array i.e 9

        // tip       To print MultiDimensional Arrays use
        System.out.println(Arrays.deepToString(numbers));
    }
}

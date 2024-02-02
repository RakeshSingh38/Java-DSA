public class brain_damage {

    // -> remember to include boiler plate
    public static void main(String[] args) {
        // Declare and initialize a two-dimensional array named 'arr'
        int[][] arr = {
            { 1, 2, 3, 4 },
            { 5, 6 },
            { 6, 4, 5 }
        };
        
        // Print the number of rows in the array
        System.out.println("length is  "+arr.length);
        
        // Iterate through each row of the array
        for (int row = 0; row < arr.length; row++) {
            // Iterate through each column of the current row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println("col is "+col +" and length is "+arr[row].length);
                // Print the value at the current row and column
                System.out.println(arr[row][col] + " ");
            }
            // Move to the next line after printing the elements of the current row
            System.out.println();
        }
    }
}

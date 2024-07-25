public class Max1 {

    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
        //int[][] arr = { { 0, 0 }, { 1, 1 },{1,1} };
        int ans = RowNo(arr);
        System.out.println(ans);
    }

    static int RowNo(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            // w     wont work for  0 1 1 1 1   and 0 0 0 1 1 
            if (arr[row][0] == 1) {
                return row;
            }
        }
        return -1;
    }
}
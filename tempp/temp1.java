class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] < 0) {
                    count++;

                }
                //    can be commented
                //    temp=count;
            }
        }
        //   we can return count too
        //   return temp;
        return count;
    }
}

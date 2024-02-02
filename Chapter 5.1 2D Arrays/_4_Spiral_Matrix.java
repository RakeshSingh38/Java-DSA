// LeetCode Q 54. Spiral Matrix

import java.util.ArrayList;
import java.util.List;

public class _4_Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        //System.out.println(Arrays.deepToString(arr));
        System.out.println(spiral(arr));
        //   [1,2,3,6,9,8,7,4,5]}

    }

    static List<Integer> spiral(int arr[][]) {
        List<Integer> ans = new ArrayList<Integer>();
        //  here left is the starting column index
        //  right is the ending column index
        //  top is the starting row index
        //  bottom is the ending row index
        int left = 0, bottom = arr.length - 1, right = arr[0].length - 1, top = 0;
        while (left <= right && top <= bottom) {
            if (top <= bottom) {
                for (int i = left; i <= right; i++) {
                    ans.add(arr[top][i]);
                }
                top++;
            }
            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    ans.add(arr[i][right]);
                }
                right--;
            }
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
/* 
public List<Integer> spiralOrder(int[][] arr) {
List<Integer> res = new ArrayList<>();
int n = arr.length, m = arr[0].length;
int left = 0, up = 0, right = m - 1, down = n - 1;

while(res.size() < n * m){
for(int i = left; i <= right && res.size() < n * m; i++) res.add(arr[up][i]);
for(int i = up + 1; i < down && res.size() < n * m; i++) res.add(arr[i][right]);
for(int i = right; i >= left && res.size() < n * m; i--) res.add(arr[down][i]);
for(int i = down - 1; i > up && res.size() < n * m; i--) res.add(arr[i][left]);

left++; right--; up++; down--;
}

return res;
}
 */

/* 
public List<Integer> spiralOrder(int[][] arr) {
List<Integer> result = new ArrayList<>();
if (arr == null || arr.length == 0) {
return result;
}

int rows = arr.length, cols = arr[0].length;
int left = 0, right = cols-1, top = 0, bottom = rows-1;

while (left <= right && top <= bottom) {
for (int i = left; i <= right; i++) {
result.add(arr[top][i]);
}
top++;

for (int i = top; i <= bottom; i++) {
result.add(arr[i][right]);
}
right--;

if (top <= bottom) {
for (int i = right; i >= left; i--) {
    result.add(arr[bottom][i]);
}
bottom--;
}

if (left <= right) {
for (int i = bottom; i >= top; i--) {
    result.add(arr[i][left]);
}
left++;
}
}

return result;
 */

/* 
public List<Integer> spiralOrder(int[][] arr) {
List<Integer> ans = new ArrayList<Integer>();
int left=0, bottom=arr.length-1, right=arr[0].length-1, top=0;
while(left<=right || top<=bottom){
    if(top<=bottom){
        for(int i=left;i<=right;i++)
        ans.add(arr[top][i]);
        top++;
    }
    if(left<=right){
        for(int i=top;i<=bottom;i++)
        ans.add(arr[i][right]);
        right--;
    }
    if(top<=bottom){
        for(int i=right;i>=left;i--)
        ans.add(arr[bottom][i]);
        bottom--;
    }
    if(left<=right){
        for(int i=bottom;i>=top;i--)
        ans.add(arr[i][left]);
        left++;
    }
}
return ans;
  */

//        int m = arr.length;
//        int n = arr[0].length;
//        int startRow = 0;
//        int endRow = m - 1;
//        int startCol = 0;
//        int endCol = n - 1;
//        while (startRow <= endRow && startCol <= endCol) {
//            for (startRow = 0; startRow < endRow; startRow++) {
//                System.out.println(arr[startRow][endRow]);
//
//                for (endRow = 0; endRow < n; endRow++) {
//                    //if (startRow != endRow) {
//                    System.out.print(arr[startRow][endRow] + " ");
//                    //} else if (endRow != startRow) {
//                    //System.out.print(arr[endRow][startCol] + " ");
//                    //}
//                }
//                //[1,2,3,6,9,8,7,4,5]}
//                startCol++;
//                startRow++;
//                endRow--;
//                endCol--;
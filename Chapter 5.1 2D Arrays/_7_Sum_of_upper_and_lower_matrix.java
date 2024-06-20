import java.util.*;

public class _7_Sum_of_upper_and_lower_matrix {
    public static void main(String[] args) {
        int arr[][] = { { 6, 5, 4 },
                { 1, 2, 5 },
                { 7, 9, 7 } };

        /* 
        for upper
        //       00 01 02
        //          11 12
        //             22
        
        for lower
        //       00 
        //       10  11 
        //       20  21  22
        
        
        // tip      i want to make this pattern
        */
        List<Integer> list = new ArrayList<>();
        int sumUpper = 0;
        int sumLower = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                sumLower += arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sumUpper += arr[i][j];
            }
        }
        list.add(sumUpper);
        list.add(sumLower);

        System.out.println(list);

        System.out.println("for function");
        ArrayList<Integer> arr2 = sumTriangles(arr, arr.length);
        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i));
        }

        //System.out.println(sumLower+sumUpper);
        //System.out.println(list.toString());

    }

    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int upperTri = 0;
        int lowerTri = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                upperTri += matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                lowerTri += matrix[i][j];
            }
        }

        arr.add(upperTri);
        arr.add(lowerTri);

        return arr;

    }

    /* 
    
    using a single loop!
    CODE:
    int i,j;
        int up=0,lw=0;
        for(i=0,j=0;i<n;)
        {
        if(i<=j)
        up+=matrix[i][j];
        if(i>=j)
        lw+=matrix[i][j];
        j++;
        if(j>=n)
        {
        i++;
        j=0;
        }
        }
        vector <int> ans;
        ans.push_back(up);
        ans.push_back(lw);
        return ans;
     */
}

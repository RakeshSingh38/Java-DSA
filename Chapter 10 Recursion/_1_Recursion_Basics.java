// tip      Solve one case and leave rest to recursion

// 102
public class _1_Recursion_Basics {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    private static void print(int n) {
        // 1 > when printed without base condition infinite loop
        //System.out.print(" "+n+" ");
        //print(n-1);
        if (n == 0) {
            //  If n is 0, the function immediately returns 
            // In this case, when n becomes 0, the function stops calling itself and starts returning.
            return;
        }
        print(n - 2);
        System.out.print(" " + n + " ");
    }
}

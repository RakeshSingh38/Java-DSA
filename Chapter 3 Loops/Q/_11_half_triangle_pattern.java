public class _11_half_triangle_pattern {
    public static void main(String[] args) {
        /* 
                    *
                   ***
                  *****
                 *******
                *********
         */
        int n = 5;
        int space = n;
        int stars = 1;
        //int stars2 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            //System.out.println();
            for (int j = 0; j < stars - 1; j++) {
                System.out.print("*");
            }
            space--;
            stars++;
            //stars2++;
            System.out.println();
        }
    }
}

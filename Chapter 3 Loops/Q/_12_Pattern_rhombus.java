public class _12_Pattern_rhombus {
    /* 
        *****
       *****
      *****
     *****
    *****
     */
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;

        // imp     no of stars is constant whats changing is the spaces 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n; k++) {
                System.out.print("*");
            }
            space--;
            System.out.println();
        }

    }
}

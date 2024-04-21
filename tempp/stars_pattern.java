public class stars_pattern {
    // Q stars in the middle of the triangle
    public static void main(String[] args) {
        int n = 5;
        int space = n / 2;
        int star = 1;
        for (int i = 0; i < n; i++) {
        //for (int i = 0; i < n; i++) {
            /* 
               *
              ***
             *****
              ***
               *
             */
            for (int j = 1; j <= space; j++) {
                System.out.print("_");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }

            if (i < n / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
            //System.out.println(space+" spacessss");
            System.out.println();
        }
    }
}

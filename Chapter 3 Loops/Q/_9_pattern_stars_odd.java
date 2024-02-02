
public class _9_pattern_stars_odd {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = row;
        int space = n - 1;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                // imp          uncomment 14 and 36 to get number wise stars
                System.out.print(" ");
                //System.out.print(" ");
                i++;
            }

            // this is for printing stars
            int j = 1;
            while (j <= star) {
                System.out.print("*");
                j++;
            }
            int k = 1;
            int space1 = n - 1;
            while (k <= space1) {
                // imp          uncomment 14 and 27 to get number wise stars
                System.out.print(" ");
                k++;
            }
            space--;
            space1++;
            row++;
            System.out.println("");
            star = star + 2;
            //star++;
        }
    }
}

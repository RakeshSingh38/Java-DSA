
public class _9_pattern_stars_odd_copy {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = row;
        int space = n - 1;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                // imp          uncomment 14 and 28 to get number wise stars
                //System.out.print(" ");
                System.out.print(" ");
                i++;
            }

            // this is for printing stars
            int j = 1;
            while (j <= star) {
                System.out.print("*");
                j++;
            }

            int k = 1;
            int anotherSpace = n - 1;
            while (k <= anotherSpace) {
                // imp          uncomment 14 and 28 to get number wise stars
                //System.out.print(" ");
                System.out.print(" ");
                k++;
            }
            space--;
            anotherSpace++;
            row++;
            System.out.println("");
            star = star + 2;
            //star++;

        }
    }
}

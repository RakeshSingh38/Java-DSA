//package Chapter
//

import java.util.Scanner;

//3 Loops.Q;

/*         * * * * *
           * * * *
           * * *
           * *
           *            */


public class _4_pattern_Q_row_space {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();

        int row = 1;
        int n = 5;
        int star = n;

        while (row <= n) {
            int i = 1;

            // star
            while (i <= star) {
                System.out.print("* ");
                //star++;
                i++;
            }
            // next row prep
            row++;
            star--;
            System.out.println();
        }
        sc.close();
    }
}
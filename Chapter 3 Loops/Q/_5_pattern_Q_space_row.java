
//
import java.util.Scanner;

//3 Loops.Q;
/* 
    *
   **
  ***
 ****
*****
 */
public class _5_pattern_Q_space_row {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n = 5;
        int row = 1;
        //int star = 1;
        int star = row;
        int space = n - 1;

        while (row <= n) {
            //             while (true) {
            //            if (row > n) break;
            int i = 1;
            // star
            while (i <= space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                //System.out.print("");
                // tip   if we add here spaces it will give different output
                System.out.print("*");
                j++;
            }
            row++;
            System.out.println("");
            space--;
            star++;
        }
        // next row prep
        sc.close();
    }
}
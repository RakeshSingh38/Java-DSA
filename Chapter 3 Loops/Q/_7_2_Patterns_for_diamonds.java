// In hackerRank : Make sure the n is provided as an input using Scanner class
// and not hard coded
public class _7_2_Patterns_for_diamonds {

    public static void main(String[] args) {
        int n = 5;
        int spaces = n / 2;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            /* 
            *  // imp      this gives
            *           1
            //         121
            //        12321
            //         121
            //          1
            for (int k = 1; k <= stars; k++) {
            if (k <= stars / 2) {
                    System.out.print(k);
                } else {
                    System.out.print(stars - k + 1);
            
                }
            }
            */
            /* 
             *  // imp      this gives
             *         1
             //       321
            //       54321
            //        321
            //         1
            for (int k = 1; k <= stars; k++) {
                if (k  / 2==stars) {
                    System.out.print(k);
                } else {
                    System.out.print(stars - k + 1);
                }
            }
             */

            // to compare i have to use i not the stars
            // fix      i am writing stars = n/2
            //          coz while preparing for next lines 
            //          i have access to i only
            if (i <= n / 2) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
            System.out.println();
        }
    }
}
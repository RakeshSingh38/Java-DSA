public class _7_3_Patter_hollow_spaces_with_stars {
    public static void main(String[] args) {
        int n = 9;
        int spaces = 1;
        int stars = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            /*  for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // to compare i have to use i not the stars
            // fix      i am writing stars = n/2
            //          coz while preparing for next lines 
            //          i have access to i only
            
            System.out.println();
            if (i <= n / 2) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }*/

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= stars; l++) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                stars--;
                spaces += 2;
            } else {
                stars++;
                spaces -= 2;
            }
            System.out.println();

        }
    }
}

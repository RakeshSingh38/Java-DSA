public class _7_4_pattern_numbers {
    public static void main(String[] args) {
    //                1 
    //              2 3 2
    //            3 4 5 4 3 
    //              2 3 2
    //                1
        int n = 5;
        int spaces = n / 2;
        int stars = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            if (i <= n / 2) {
                val = i;
            } else {
                val = n - i + 1;
            }
            /*  // with these change i got
            //           1 
            //         2 3 2
            //       1 2 3 2 1  
            
            if (i <= n / 2) {
                val = i;
            } else {
                n = n + 1 - i;
            }*/
            for (int k = 1; k <= stars; k++) {
                System.out.print(val + " ");
                if (k <= stars / 2) {
                    val++;
                } else {
                    val--;

                }
            }
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
//package Chapter 3 Loops.Q;

/* 
*
**
***
****
*****
****
***
**
*
 */
public class _8_pattern_to_print_inverse_stars_up_down {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = row;
        while (row <= 2 * n - 1) { // row <= 9
            //int i = 1;
            if (row > n) {
                //i++;
                star = 2 * n - row; // star = 10 - row , row will be 6 , 7 , 8 , 9 , 10
            }
            //System.out.println("");
            int j = 1;
            while (j <= star) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            row++;
            star++;
        }
    }
}

//while (star == 5) {
//    int j = 1;
//    while (j <= star) {
//        System.out.print("*");
//        j++;
//    }
//    System.out.println("");
//    star--;
//    row++;
//}

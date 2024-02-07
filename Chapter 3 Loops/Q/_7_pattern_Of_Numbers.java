//package Chapter 3 Loops.Q;
/* 
    1
    12
    123
    1234
    12345
 */
public class _7_pattern_Of_Numbers {
    public static void main(String[] args) {
        //int row = 1;
        //int num = row;
        int n = 3;
        //while (row <= n) {
        //    int i = 1;
        //    while (i <= num) {
        //        System.out.print(i);
        //        i++;
        //    }
        //    row++;
        //    num++;
        //    System.out.println("");
        //}
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.println();

        int nst = 3;
        for (int i = 1; i <= nst; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        // imp      for simple understanding
        int no_of_stars = 1;
        int num = 3;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= no_of_stars; j++) {
                System.out.print("* ");
            }
            no_of_stars++;
            System.out.println();
        }



    }
}

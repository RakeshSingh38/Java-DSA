import java.util.Scanner;

/*      *
        * *
        * * *
        * * * *
        * * * * *           */


public class _3_pattern_Spaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = 1;
        //int n = sc.nextInt();
        int n = 5;

        while (row <= n) {
            int i = 1;

            // star
            while (i <= row) {
                System.out.print("* ");
                i++;
            }
            // next row prep
            row++;
            System.out.println();
        }
        sc.close();
    }
}

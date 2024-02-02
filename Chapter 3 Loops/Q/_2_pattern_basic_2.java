import java.util.Scanner;

public class _2_pattern_basic_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int i = 1;
        int row = 1;
        int star = n;
        /* 
         * 1 >   decide total number of rows
         * 2 >   decide total number of Stars to print
           // imp      total different work
                    TO only print start
        
                    1st loop is on row
                    then what is the task on row 
                    // tip   we have to do a task on row
            3 >   Code
         */
        while (row <= n) {
            // start

            int i = 1;

            while (i <= star) {
                System.out.print("*");
                i++;
            }
            // next row preparation
            System.out.println(" ");
            row++;
        }
        sc.close();
    }
}

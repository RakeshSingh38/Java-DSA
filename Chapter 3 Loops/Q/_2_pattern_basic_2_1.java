
//package Chapter 3 Loops.Q;
import java.util.Scanner;

public class _2_pattern_basic_2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int i = 1;
        int n = 5;
        int row = 1;
        //int star = n;
        /* 
         * 1 >   decide total number of rows
         * 2 >   decide total number of Stars to print
         * 3 >   prepare for next line
         */
        while (row <= n) {
            // start
            int i = 1;
            // if the inner loop is false it  wont execute
            //                            ↓ 
            while (i <= 0) {
                // Q        why  ? becoz 1 is not less than or equal to 0 hence the outer loop will be run 
                //      but if its true then this loop will run till the condition is true once its satisfied
                //      control will be move to outer loop i,e line number 
                System.out.print("*");
                i++;
            }
            
            // next row preparation
            System.out.println("outer loop");
            row++;
        }
        sc.close();
    }
}

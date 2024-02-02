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
        int row = 1;
        int num = row;
        int n = 5;
        while (row <= n) {
            int i = 1;
            while (i <= num) {
                System.out.print(i);
                i++;
            }
            row++;
            num++;
            System.out.println("");
        }
    }
}

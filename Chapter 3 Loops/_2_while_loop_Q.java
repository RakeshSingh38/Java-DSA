// imp      Print till n numbers
import java.util.Scanner;

public class _2_while_loop_Q {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner (System.in)) {
            int input = sc.nextInt();

            while(i<=input){
                System.out.println(i);
                i++;
            }
        }
    }
}

import java.util.Scanner;
public class _2_If_else_Q {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int a = sc.nextInt();
            // int b = sc.nextInt();
            if(a%2==0){
                System.out.println("number is even");

            }
            else{
                System.out.println("number is odd");
            }
        }
    }
}

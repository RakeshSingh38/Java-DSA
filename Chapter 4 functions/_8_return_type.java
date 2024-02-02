import java.util.Scanner;

public class _8_return_type {

    static int sum() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st number");
            int num1 = sc.nextInt();
            System.out.println("Enter 2nd number");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            return sum;

            // System.out.println("This line will never be accessible");
        }
    }

    static int sum2(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);

        int ans2 = sum2(21, 56);
        System.out.println("\nanswer for sum 2 is :\t\n");
        System.out.println(ans2);


        
    }

}
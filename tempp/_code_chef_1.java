import java.util.*;

public class _code_chef_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // suppose t is 2 so the while loop will run till t times i.e 2
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // write your code here
            System.out.println(a + b);
        }
        sc.close();
    }

}

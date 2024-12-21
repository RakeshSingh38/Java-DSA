import java.util.Scanner;

public class _1_easy_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && t < 100) {
            int k = sc.nextInt();
            System.out.println(k - 1);
            t--;
        }

        sc.close();
    }
}

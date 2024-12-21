import java.util.Scanner;

public class _2_Normal_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline

        while (t-- > 0) {
            String a = sc.nextLine();
            StringBuilder b = new StringBuilder();

            for (char c : a.toCharArray()) {
                if (c == 'p') {
                    b.append('q');
                } else if (c == 'q') {
                    b.append('p');
                } else if (c == 'w') {
                    b.append('w');
                }
            }

            System.out.println(b.reverse().toString());
        }
        sc.close();
    }
}

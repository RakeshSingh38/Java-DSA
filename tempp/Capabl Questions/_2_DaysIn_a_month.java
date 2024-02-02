import java.util.Scanner;
// Q    = to find the number of days in a month
public class _2_DaysIn_a_month {
    static int daysInMonth(int month) {

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else
            return 28;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputMonth = scanner.nextInt();
        int result = daysInMonth(inputMonth);
        System.out.println(result);
        scanner.close();
    }
}

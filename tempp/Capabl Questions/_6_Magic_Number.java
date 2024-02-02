import java.util.Scanner;

public class _6_Magic_Number {
    // w     dont know why they have given this function
    
    //static int sumOfDigits(int num) {
    //    int sum = 0;
    //    sum += num;
    //    return sum;
    //}

    static boolean isMagicNumber(int num) {
        if (((num - 1) % 9) == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String result = isMagicNumber(inputNumber) ? "Yes" : "No";
        System.out.println(result);
        scanner.close();
    }
}

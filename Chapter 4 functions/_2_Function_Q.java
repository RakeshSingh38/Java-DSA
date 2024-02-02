
// package Chapter 4 functions;
import java.util.Scanner;

public class _2_Function_Q {
    static void ageCheck(int age) { // imp      Parameters or Formal parameters
        if (age < 18) {
            System.out.println("Age is less than 18\n Access is denied");
            // fix                 Here spaces count ↑ be careful 

        } else {
            System.out.println("You are old enough\nAccess Granted");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            ageCheck(input); // imp       2> Actual Arguments
        }
    }
}
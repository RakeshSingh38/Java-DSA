// imp     Java program for Calculator

// Instead of writing many if..else statements, you can use the switch statement.
// The switch statement selects one of many code blocks to be executed: 

import java.util.Scanner;

// ->    😊 we can use double , floating , characters too in cases but we have to use similar varibale to do so 😊; 

public class _8_Switch_case_Q {
    public static void main(String[] args) {
        System.out.println("Press 0 to Exit");
        boolean exit = true;
        try (Scanner sc = new Scanner(System.in)) {
            while (exit) {
                System.out.println("Enter two digits : ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Enter Operator : ");
                char operator = sc.next().charAt(0);
                System.out.println();
                switch (operator) {
                    case '+':
                        System.out.println(a + b);
                        break;
                    case '-':
                        System.out.println(a - b);
                        break;
                    case '*':
                        System.out.println(a * b);
                        break;
                    case '/':
                        System.out.println(a / b);
                        break;
                    case '%':
                        System.out.println(a % b);
                        break;
                    case '0':
                        exit = false;
                        //System.out.println(a % b);
                        break;
                    default:
                        System.out.println("Unknown symbol");
                        break;
                }
            }
        }
    }
}

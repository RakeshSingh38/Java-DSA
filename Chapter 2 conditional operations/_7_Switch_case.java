// imp     Java Switch Statements

// Instead of writing many if..else statements, you can use the switch statement.
// The switch statement selects one of many code blocks to be executed: 

import java.util.Scanner;

// ->    😊 we can use double , floating , characters too in cases but we have to use similar varibale to do so 😊; 

public class _7_Switch_case{
    public static void main (String[] args){
        System.out.print("Enter the day : ");
        try (Scanner sc = new Scanner (System.in)) {
            int day = sc.nextInt();

            switch(day){
                case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                default:
                System.out.println("Sunday");
                break;
            }
        }
    }
}
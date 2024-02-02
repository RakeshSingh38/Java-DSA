import java.util.Scanner;

public class _1_Calculator {

    static public void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float addition, subtraction,Multiply, Divide;
            System.out.println("Choose a operator from + - * /");
            char operator = sc.next().charAt(0);
            System.out.println("Enter First number");
            float number_1 = sc.nextFloat();
            System.out.println("Enter Second number");
            float number_2 = sc.nextFloat();
            //System.out.println(number_1);
            //System.out.println(number_2);

            switch (operator) {
                case '+':
                    //System.out.println("Press 1 to add numbers");
                    addition = number_1 + number_2;
                    System.out.println("Sum is :"+addition);
                    break;
                case '-':
                    //System.out.println("Press 1 to add numbers");
                    subtraction = number_1 - number_2;
                    System.out.println("Sum is :"+subtraction);
                    break;

                case '*':
                    //System.out.println("Press 2 to Multiply");
                    Multiply = number_1 * number_2;
                    System.out.println("Multiplication is :"+Multiply);
                    break;

                case '/':
                    //System.out.println("Press 3 to Divide");
                    Divide = number_1 / number_2;
                    System.out.println("Divide is :"+Divide);
                    break;

                default:
                    System.out.println("Invalid Number");
            }
        }
    }
}

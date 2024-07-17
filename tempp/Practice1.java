import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Bye");
        System.out.println("World");

        int a = 10;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter single word: ");
        String input = sc.next();
        //sc.nextLine();
        System.out.println(input);

        
        System.out.print("Enter multiple words: ");
        String multi = sc.nextLine();
        System.out.println(multi);

        System.out.print("Enter the first number: ");
        int c = sc.nextInt();
        System.out.print("Enter the second number: ");
        int d = sc.nextInt();
        int sum = c + d;
        int multiply = c * d;

        System.out.println("Sum is: " + sum);
        System.out.println("Multiplication is: " + multiply);

        System.out.print("Enter the radius: ");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;

        System.out.println("The area of the circle is: " + area);

        sc.close();
    }
}
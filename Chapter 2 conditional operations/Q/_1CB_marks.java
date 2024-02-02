import java.util.Scanner;

public class _1CB_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Marks");
        int marks = sc.nextInt();
        if (marks >= 75)
            System.out.println("Your Grade is A");
        if (marks >= 65 && marks < 75)
            System.out.println("Your Grade is B");
        if (marks >= 55 && marks < 65)
            System.out.println("Your Grade is C");
        if (marks >= 45 && marks < 55)
            System.out.println("Your Grade is D");
        if (marks < 45)
            System.out.println("Your are fail ,all the best for the future");
        sc.close();
    }
}

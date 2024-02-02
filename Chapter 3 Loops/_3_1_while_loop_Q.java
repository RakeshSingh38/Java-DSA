import java.util.Scanner;

public class _3_1_while_loop_Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        String name;

        //name.length() = 0;    // w       wrong way to make it false    

        name = ""; // r     right way to make it true or 0 in isEmpty()
        // imp       variableName.isBlank() => Returns:true if the string is empty or contains only white space codepoints, 
        //                                                                                      otherwise false

        // variableName.isEmpty() => Returns: true if length() is 0, otherwise false
        //System.out.println(name.isBlank());
        while (name.isBlank()) {
            System.out.print("Your good name : ");
            name = sc.nextLine();
        }
        System.out.println("You are special as your name is : " + name);
        sc.close();
    }
}

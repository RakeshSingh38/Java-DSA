import java.util.Scanner;

// imp      A  Java program that interacts with the user through the console

// r         simple text-based interaction between the user and the program. 
//           The user is given a message and then has the option to quit the game by entering "q" or "Q", 
//                              or 
//           continue playing by entering anything else

public class _10_AND_game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //String input = sc.next();

        System.out.println("You are playing the game Hope u have fun");

        // uncomment 2nd conditional statement to understand or operator and ! operator
        String response = sc.next();

        // see     The program then checks if the user's response is either "q" or "Q". 
        //         This is done using the equals() method of the String class, which compares this string to the specified object. 
        //         If the user's response is either "q" or "Q", 
        //         the program prints "You Quit the game" to the console and ends. 

        // r        or operator if either of these one is true executes "if" statement  , if not then "else" gets executes 
        //if (response.equals("q") || response.equals("Q")) {
        //    System.out.println("You Quit the game");
        //} else {
        //    System.out.println("You are Still in the game");
        //}

        // ! and && operator 
        // r        as the name suggests not equals to will print "if" statement and if its true then we print show the "else"

        // see      uncomment below and comment above if statements

        if (!response.equals("q") && !response.equals("Q")) {
            // tip      in this case till the input is not equals to q or Q we print this
            System.out.println("You are Still in the game");
        } else {
            //      but once the input is q or Q we print this
            System.out.println("You Quit the game");
        }

        sc.close();
    }
}
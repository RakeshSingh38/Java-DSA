import java.util.*;
import java.util.function.Consumer;

interface MyLambda {

    // there can be only 1 abstract method in a functional interface 
    // i.e there needs to be only 1 method in interface then only lambda expression can be used
    public void display(String s);

}

interface AnotherLambda {

    // add multiple arguments here 
    public int add(int a, int b);
}

public class _2_Lambda_examples {
    public static void main(String[] args) {
        //MyLambda obj = () -> {
        //    System.out.println("Namaste World");
        //};
        //obj.display();

        // or
        MyLambda obj2 = (s) -> {
            System.out.println(s);
        };
        obj2.display("Namaste World");

        // imp      for multiple arguments
        AnotherLambda obj3 = (a, b) -> {
            return (a + b);
        };
        System.out.println(obj3.add(12, 5));

        //or

        // One Liner
        AnotherLambda obj4 = (a, b) -> a + b;
        int sum = obj4.add(12, 5);
        System.out.println(sum);

        // looping in Lambda expression
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        System.out.println("\nLooping in Lambda expression\n");
        numbers.forEach((n) -> {
            System.out.print(n + " ");
        });

        /* 
        Lambda expressions can be stored in variables if the variable's type is an interface which has only one method. 
        The lambda expression should have the same number of parameters and the same return type as that method. 
        Java has many of these kinds of interfaces built in, such as the Consumer interface (found in the java.util package) used by lists.
         */

        // Example
        System.out.println("\n\nUsing Consumer interface\n");
        Consumer<Integer> method = (n) -> {
            System.out.print(n + " ");
        };
        numbers.forEach(method);
    }
}

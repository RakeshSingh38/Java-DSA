import java.util.Scanner;

public class _1_functions {

// imp       A method is a block of code which only runs when it is called. 
// You can pass data, known as parameters, into a method.       
// Methods are used to perform certain actions, and they are also known as functions.
// Why use methods? To reuse code: define the code once, and use it many times.

     static void add(int a,int b){

        int sum=a+b;
        // System.out.println(sum);
        System.out.println("Sum is "+sum);
//        return;
    }
    public static void main(String[] args) {
        int a=12;
        int b=13;
        add(a,b);
        try (Scanner sc = new Scanner (System.in)) {
            int c = sc.nextInt();
            int d = sc.nextInt();

            // add(15, 78);
            add(c, d);
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class _4_ways_to_print_arrays {
    public static void main(String[] args) {

        // int in = sc.nextint();
        // see there are 3 ways to print an array

        // imp 1 >
        try (Scanner sc = new Scanner(System.in)) {
            int[] array = new int[5];
            array[0] = 11;
            array[1] = 12;
            array[2] = 13;
            array[3] = 14;
            array[4] = 15;

            System.out.println("1st method");
            System.out.println("3rd index of array is : " + array[2]);

            // imp      2 > input using loops

            System.out.println("2nd method\n");
            String[] names = new String[4];
            for (int i = 0; i < names.length; i++) {
                // ->       suppose i have length as 3 , so i have to take inputs like this without loop 😔
                //  names[0] = sc.nextLine();
                //  names[1] = sc.nextLine();
                //  names[2] = sc.nextLine();
                // r      but since we have loops we can ease it only difference is 
                // put i where u give index numbers 
                // eg:- names[0] = sc.nextLine() i will write it as names[i] = sc.nextLine();
                //  the i here will go through all index of the given length and hence we can give inputs to every
                names[i] = sc.nextLine();
            }
            //for below code Enhanced forEach loop
            for (String name : names) {
                System.out.print((name) + " ");
                // Arrays.toString(name)  wont work here as
                /* name is a String, not an array of long values, so you cannot use Arrays.toString(name). 
                The Arrays.toString() method is used to convert arrays to a string representation, not individual String 
                values  */
                // fix     make sure to not include in printIn else new line
            }
            System.out.println("");

            System.out.println(Arrays.toString(names));

            //            for (int i = 0; i < array.length; i++) {
            //
            //                System.out.print(array[i] + " ");
            //                // fix     make sure to not include in printIn else new line
            //            }

            System.out.println("\n\n");
            // imp      or 2.1 > method forEach method
            System.out.println("ForEach method");
            for (int i : array) {
                System.out.print(" " + i);
            }

            // imp     3 > array to string method

            System.out.println("\n3rd method");
            System.out.print(Arrays.toString(array));

            String hey = "rakesh";
            //String result = hey.replace(oldCharacter, NewCharacter);
            String result = hey.replace("ra", "Ni");
            System.out.println("\n" + result);
        }

        // w     forEach cant be used for input and it doesnt skip anything in between
        // w      cannot traverse in  reverse order another flaw 

        // for (String i : str) {  
        //     str[i]= inn.next;
        // }

    }

}

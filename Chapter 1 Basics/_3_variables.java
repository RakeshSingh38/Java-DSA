
public class _3_variables {
    // imp     
    /*  Variables are containers for storing data values.

    In Java, there are different types of variables, for example:

    String - stores text, such as "Hello". String values are surrounded by double quotes
    int - stores integers (whole numbers), without decimals, such as 123 or -123
    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
      boolean - stores values with two states: true or false */

    public static void main(String[] args) {
        System.out.print("hey\n");

        // literals = 1 2 3 4 5 6
        // character literals = 'a' 'b' 'c' 'd' 'e' 'f' 'g' etc

                        int          a            = 5;
        //               ↑           ↑              ↑                                                               
        //               |           |              |                                                               
        //             data type   variable      operand                                                                        

        /* All Java variables must be identified with unique names.
        
        These unique names are called identifiers. */

        int myNum = 20;
        short number = 9999;
        // ->     if out of range error is Type mismatch : cannot convert int to short
        char myLetter = 'a';
        // if out of range error is Invalid character constant
        float real = 21.5f;
        // if out of range error is : The literal is out of range
        boolean d = true;
        //  cannot be resolve to a variable
        String myText = "RakeshK";
        byte value = 55;
        // if out of range error is Type mismatch : cannot convert byte to int
        long integer = 5454L;
        // if out of range error is : The literal is out of range
        double values = 7564;
        // if out of range error is : The literal is out of range

        System.out.println();
        System.out.println(myNum);
        System.out.println(number);
        System.out.println(myLetter);
        System.out.println(real);
        System.out.println(d);
        System.out.println(myText);
        System.out.println(value);
        System.out.println(integer);
        System.out.println(values);
        System.out.print(a);

    }
}

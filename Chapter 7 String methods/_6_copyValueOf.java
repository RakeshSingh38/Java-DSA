
public class _6_copyValueOf {
    public static void main(String[] args) {
        // Return a String that represents certain characters of a char array:
        // This method returns a new String array and copies the characters into it.

        /* 
        Parameter	Description
        data	    A char array
        offset	    An int value, representing the start index of the char array
        count	    An int value, representing the length of the char array
         */
        char[] myStr1 = { 'R', 'a', 'k', 'e', 's', 'h' };
        String myStr2 = "";
        myStr2 = String.copyValueOf(myStr1, 0, 5);
        System.out.println("returned string " + myStr2);

    }
}

public class _8_indexOf {
    public static void main(String[] args) {
        /* 
            The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
        
         */
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("are"));

        System.out.println(myStr.lastIndexOf("great"));
        //             Tip: Use the lastIndexOf method to return the position of the last occurrence of specified character(s) in a string.
        // see      same for both indexof and lastIndexOf
        //   Returns:	An int value, representing the index of the first occurrence or last occurence of the character in the string, or -1 if it never occurs
    }
}

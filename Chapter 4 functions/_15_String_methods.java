public class _15_String_methods {
    
    public static void main(String[] args) {
        // imp     String a referce data type that can store one or more characters
        //              reference data types have access to useful methods 

        String name = "Bro";
   
        System.out.print("Checking if cases match or not : ");
        boolean result= name.equals("bro");
        // see      will tell if characters are cases are equal or not
        System.out.println(result);

        System.out.print("Ignore case; : ");
        boolean result1=name.equalsIgnoreCase("bro");
        System.out.println(result1);
        // ->        Compares this String to another String, ignoring case considerations. 


        int ans=name.length();
        System.out.println("length of name is : "+ans);
        // ->      Returns the length of this string


        char character=name.charAt(0);
        System.out.println("Character at 0th index is"+character);
        // ->     Returns the char value at the specified index

        int index=name.indexOf("o");
        System.out.println(index);
        // ->     Returns the index within this string of the first occurrence of the specified substring.

        // If no such value exists , then -1 is returned

        // imp      String check1=""; 
        //       if its like this  ↑    empty then its true otherwise false (if we put onyly spaces there still it would be false as spaces are not characters)
        String check1="hii";
        boolean check=check1.isEmpty();
        System.out.println(check);

        String uppercase= name.toUpperCase();
        System.out.println("convert the characters of this string to upperCase : "+uppercase);
        // ->     convert the characters of the string to uppercase

        String lowercase=name.toLowerCase();
        System.out.println("convert the characters of this string to lowerCase : "+lowercase);
        // ->     convert the characters of the string to lowerCase
        
        String characters="             Hiii hi";
        String resultString = characters.trim();
        System.out.println(resultString);
        // ->     This removes the spaces before and after the characters 
        //          spaces between characters are not trimmed
        //                      i.e Rakesh Singh 
        //                                ↑
        //                          It wont trim at    
    }

}

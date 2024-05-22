
public class _4_concat {
    public static void main(String[] args) {
        //The concat() method appends (concatenate) a string to the end of another string.
        // Returns:	A String, representing the text of the combined strings
        String str1 = "Rakesh";
        String str2 = " Singh";
        System.out.println(str1.concat(str2));

        //str1 = str1.concat(" Singh");

        System.out.println("\ncharAt() method\n");
        for (int i = 0; i <= str1.length() - 1; i++) {
            System.out.print("" + str1.charAt(i));
        }
        System.out.println();
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(str1.length() - 1));
        //System.out.println(str1);

        //SubString 
        System.out.println("\nSubString\n");
        //The substring() method extracts the characters from a string, between two specified indices, and returns the new sub string.
        //end index is exclusive so  n-1 , start index is inclusive
        System.out.println(str1.substring(0, 3));
        System.out.println(str1.substring(3, 3));
        System.out.println(str1.substring(3));

        System.out.println("\nindexOf() method\n");
        //The indexOf() method returns the index within the string of the first occurrence of the specified character, or -1 if the character does not occur.

        System.out.println(str1.indexOf("h"));
        System.out.println(str1.indexOf("a", 8));
        
        // test         
        String str = "Rakesh";
        String string1 = "Rakesh";
        System.out.println(str == string1); // true
        boolean result = str.equals(string1);
        System.out.println(result); // true
        

        String n1 = new String("Rakesh");
        String n2 = new String("Rakesh");

        boolean result1 = n1 == n2;
        System.out.println(result1); // false

    }
}

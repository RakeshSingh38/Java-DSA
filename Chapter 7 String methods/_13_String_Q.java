import java.util.Arrays;

// Q        toggle characters into lowerCase or UpperCase
public class _13_String_Q {
    public static void main(String[] args) {
        //int n = ;

        // this line is only for taking the string and making it to character
        char[] ch = new char[6];

        // we take input in String
        String st = "RakESh";

        // it takes each character of string and store it in ch array
        for (int i = 0; i < ch.length; i++) {
            ch[i] = st.charAt(i);
        }
        //System.out.println("h");
        //System.out.println(ch);
        System.out.println("Toggle characters into lowerCase or UpperCase : ");
        toggle(ch);

        System.out.println("\n\nReversed character array is :");

        reverse(ch);
        System.out.println();

        reverseUsing_Start_End_point(st);
    }

    private static void reverse(char[] ch) {
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print((ch[i]) + " ");
        }
    }

    // imp      if input is in String we have to convert it to characters so that we can easily perform our operations
    static void reverseUsing_Start_End_point(String st) {
        // this line is only for taking the string and making it to character as with String we can't perform operations
        // we have to take whole string and convert it to character array so that we can perform operations
        char[] ch = st.toCharArray();
        System.out.println("\nCharacter array is : ");
        System.out.println(Arrays.toString(ch));
        int start = 0;
        int end = ch.length - 1;
        while (start <= end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        // r        Below and above code both are same ( use anyone )
        /*for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print((ch[i]) + " ");
        }*/

        System.out.println(Arrays.toString(ch));
        // or 

        // what it does is take the character array and convert it to string

        // to suppress the warning u can write before the method or variable declaration
        //@SuppressWarnings("static-access")

        // to Suppress the warnings such as variable is not used etc ( Case Sensitive ) https://www.ibm.com/docs/en/wdfrhcw/1.4.0?topic=code-excluding-warnings
        //@SuppressWarnings("unused")

        String ans = String.valueOf(ch);
        System.out.println(ans + "  ");

        //System.out.println(ans+"  " + ans.getClass().getName());
    }

    private static void toggle(char[] ch) {

        // imp      to toggle characters into lowerCase or UpperCase
        // if character is in upperCase then convert it to lowerCase and vice versa
        for (int i = 0; i < ch.length; i++) {

            // if the character is in between 65 to 90 ( ASCII range ) then it is in upperCase 
            if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] = (char) (32 + ch[i]);

                // else if the character is in between 97 to 122 ( ASCII range ) then it is in lowerCase
            } else {
                ch[i] = (char) (ch[i] - 32);
            }
        }

        // r      Our work isn't done yet, we have to print the character array so we have to convert it to string
        //System.out.println(Arrays.toString(ch));
        for(int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}

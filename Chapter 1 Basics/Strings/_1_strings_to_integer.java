//import java.lang.ProcessBuilder.Redirect.Type;
//import java.lang.reflect.Field;

public class _1_strings_to_integer {

    public static void main(String[] args) {
        String s = "60";
        System.out.println(Integer.parseInt(s));
        // tip      to  convert a string to an integer
        int n = (Integer.parseInt(s) + 4);
        //System.out.println(s);
        if (Integer.valueOf(n) instanceof Integer) {
            System.out.println("The variable 'n' is an Integer");
        }
        if (String.valueOf(s) instanceof String) {
            System.out.println("The variable 's' is an Integer");
        }
        System.out.println(n);
        String y = "33";
        System.out.println(y instanceof String);
        //System.out.println(n);

        // imp      to convert integer to string
        System.out.println(s.toString());
        //System.out.println(s);

        // imp     using regular expressions to convert a string to an integer
        System.out.println();
        //int temp = 0;
        String num = "age : 23";
        String temp = num.replaceAll("\\D", "");
        if (Integer.valueOf(temp).equals(Integer.parseInt(temp))) {
            System.out.println("The string 'temp' is an Integer");
        }
        System.out.println(temp);
        //System.out.println(num);
        System.out.println(temp instanceof String);

    }

}
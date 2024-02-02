//import java.lang.ProcessBuilder.Redirect.Type;
//import java.lang.reflect.Field;

public class _1_strings_to_integer {

    public static void main(String[] args) {
        String s = "60";
        System.out.println(Integer.parseInt(s));
        // tip      to  convert a string to an integer

        //int n=(Integer.parseInt(s) + 4);

        String y = "33";
        System.out.println(y instanceof String);
        //System.out.println(n);

        // imp      to convert integer to string
        System.out.println(s.toString());
        //System.out.println(s);

        // imp     using regular expressions to convert a string to an integer
        System.out.println();
        String num = "age : 23";
        s = num.replaceAll("\\D", "");
        //System.out.println(num);
        System.out.println(s);

    }

}
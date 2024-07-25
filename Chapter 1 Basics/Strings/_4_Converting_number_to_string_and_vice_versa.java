import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _4_Converting_number_to_string_and_vice_versa {
    public static void main(String[] args) {
        String input = "Number is 123";
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String number = matcher.group();
            int num = Integer.parseInt(number);
            System.out.println("Number: " + num);
        } else {
            System.out.println("No number found in the input string.");
        }
    }
}

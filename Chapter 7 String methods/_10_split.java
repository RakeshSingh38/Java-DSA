import java.util.Arrays;

public class _10_split {
    public static void main(String[] args) {
        String myString = "Rakesh Singh is my name";
        String[] split = myString.split("\\s");
        System.out.println(Arrays.toString(split));
    }
}

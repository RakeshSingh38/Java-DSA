import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;

public class _18_Formatting {
    public static void main(String[] args) {
        // 1234567
        // 0.1 -> want to represent as 0.10

        //NumberFormat currency = new NumberFormat();
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // imp      known as method chaining
        String number = NumberFormat.getPercentInstance().format(0.1);
        // it returns a string so i need to store it in a variable String
        // can also be written as  ↑
        //String number = percent.format(0.1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setCurrency(Currency.getInstance(Locale.US));
        // it returns a string so i need to store it in a variable String
        String perceString = currency.format(12_34_56.781);

        System.out.println(" " + number);
        System.out.println(perceString);
    }
}
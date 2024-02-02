import java.util.Random;

public class _15_Random {
    public static void main(String[] args) {
        Random randomNumber = new Random();

        // they are not real random numbers but pseudo numbers

        int x = randomNumber.nextInt(6) + 1;
        // imp      range is between -2 billion to +2 billion
        System.out.println(x);

        double number = randomNumber.nextDouble();
        System.out.println(number);

        boolean expression = randomNumber.nextBoolean();
        System.out.println(expression);

        float decimal = randomNumber.nextFloat();
        System.out.println(decimal);

        // imp      random is not working for Strings
        //String string = randomNumber.nextLne();
        //System.out.println(string);

    }
}

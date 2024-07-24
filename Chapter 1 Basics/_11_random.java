import java.util.Random;

public class _11_random {

    public static void main(String[] args) {
        Random random = new Random();

        // int x = random.nextInt();
        // default limit is postive 2 billion to negative 2 billion
        // to over ride it

        System.out.print("Integer random value is ");
        int x = random.nextInt(7) + 1;
        System.out.println(x);

        System.out.print("double random value is ");
        double y = random.nextDouble();
        System.out.println(y);

        System.out.print("Boolean random value is ");
        boolean a = random.nextBoolean();
        System.out.println(a);

        System.out.println("char");
        char ch = (char) (random.nextInt(26) + 'a');
        System.out.println(ch);
    }

}

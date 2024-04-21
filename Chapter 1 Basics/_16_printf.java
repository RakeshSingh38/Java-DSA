
// imp      learn more about it from the Internet

public class _16_printf {
    public static void main(String[] args) {
        System.out.printf("%d is my age\n", 23);
        System.out.printf("%s is my Name\n", "Rakesh");
        System.out.printf("%f ", 2000.00);

        System.out.println("\n");
        // imp      printf is used to format the output in a specific way
        int num = 51;
        boolean isPrime = true;
        double yesOrNo = 52.0f;
        char ch = 'a';
        String name = "Rakesh";
        // imp      spaces are preserved so be careful while using printf -> uncomment the below line to see the output with spaces
        //System.out.printf("Integer is %d \nboolean is %b\n double is %f\n character is %c", num, isPrime, yesOrNo, ch);

        // spaces are take care of as \n is used just after the next Line statement
        System.out.printf("Integer is %d\nboolean is %b\ndouble is %.1f\ncharacter is %c\nString name is %s", num,
                isPrime, yesOrNo, ch, name);

        System.out.println('\n');
    }
}

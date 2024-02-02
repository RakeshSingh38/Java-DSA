public class _a {


    // imp     to reverse a number logic 
    public static void main(String[] args) {
        int n = 1067;

        while (n>0) {
            int lastDigit=n%10;
            System.out.print(" "+lastDigit);
            n=n/10;
        }
        System.out.println();
    }
}

public class _a {

    // imp     to reverse a number logic 
    public static void main(String[] args) {
        int n = 1067;

        while (n > 0) {
            //int lastDigit=n%10;
            //System.out.print(" "+lastDigit);
            n = n / 10;
        }
        System.out.println();
        String st = "Rakesh Singh";
        System.out.println(st);
        //st.charAt(9) = 'n';
        System.out.println(st.charAt(9));

        System.out.println();
        char ch2 = 66;
        // it automatically typecasted to B ;
        System.out.println(ch2);

        char ch3 = 66;
        // it automatically typecasted to B ;
        System.out.println(ch3);

        System.out.println();

        int x = 'A';
        x = x + 2;
        System.out.println(x);
        System.out.println();

        char ch4 = 'A';
        ch4 = (char) (ch4 + 3);
        System.out.println(ch4);
    }
}

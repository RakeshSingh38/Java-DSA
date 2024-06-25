import java.util.Scanner;

public class _1_Basics {
    public static void main(String[] args) {
        //String s = "heyyy";
        //int n = 123; // Replace 123 with the appropriate integer value
        //int arr = 12345;
        //System.out.println(reverseArray(arr));

        //String s1 = reverse(535341);
        //System.out.println(s1);
        //System.out.println(reverse(9534));
        //String n1 = reverseString("Heyy");
        //System.out.println(n1);
        //System.out.println(converttoBinary(13));

        //System.out.println(reverseNumber(n));

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        reverseNumber(N);
        sc.close();
    }

    // Q    for a number if it has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
    static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int ld = n % 10;
            reverse = reverse * 10 + ld;
            n /= 10;
        }
        return reverse;
    }

    static String reverse(int s) {
        String str = String.valueOf(s);
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    static String converttoBinary(int n) {
        String res = "";
        while (n != 0) {
            if (n % 2 == 1) {
                res += "1";
            } else {
                res += "0";
            }

            n = n / 2;
        }
        String s1 = reverseString(res);
        return s1;
    }

    //static void reverse(int s) {
    //    String str = String.valueOf(s);
    //    for (int i = str.length()- 1; i >= 0; i--) {
    //        System.out.println(i);
    //    }
    //}

    // tip    To reverse a Integer
    static String reverseInteger(int arr) {
        String str = String.valueOf(arr);
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    static int reverseArray(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
    static boolean armStrongNumber(int n){
        int sum = 0;
        int temp = n;
        while(n>0){
            int ld = n%10;
            sum = sum + ld*ld*ld;
            n = n/10;
        }
        return sum == temp;
    }
}

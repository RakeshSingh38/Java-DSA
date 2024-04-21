import java.util.Scanner;

public class testtt2 {
    public static void main(String[] args) {
        //Write a program that takes a character as input and prints it using switch case. If the character is an alphabet (A - Z or a - z), the program should print 0. If the character is an uppercase alphabet (A - Z), the program should print 1. If the character is a lowercase alphabet (a - z), the program should print 0. If the character is not an alphabet, the program should print -1.
        //char ch = 'A';
        //for (int i = 0; i < 26; i++) {
        //    System.out.println(ch);
        //    ch++;
        //}
        Scanner ans1 = new Scanner(System.in);
        char ch = ans1.next().charAt(0);

        int count = 0;
        if (ch <= 'z' && ch >= 'a') {
            count = 0;
        } else if (ch <= 'Z' && ch >= 'A') {
            count = 1;
        } else {
            count = 2;
        }

        switch (count) {
            case 0:
                System.out.println("0 , Its a smaller letter");
                break;
            case 1:
                System.out.println("1 , its a bigger letter");
                break;
            case 2:
                System.out.println("-1 , not a letter");
                break;
        }
        /*char count = 0;
        for (int i = 0; i < 26; i++) {
            char small = 'a';
            if (ch == small) {
                count = 0;
                break;
            }
            small++;
        }
        for (int i = 0; i < 26; i++) {
            char big = 'A';
            if (ch == big) {
                count = 1;
                break;
            }
            big++;
        }
        if (count > 1) {
            count = 2;
        }
        System.out.println(count);
        System.out.println();*/
        System.out.println();
        System.out.println(count);

        //1. O, or -1 according to the following rules.
        //1. if charcxter is an alphabet (A - Z).
        //0. if the character is a lowercase alphabet (a - z).
        //-1. if the character is not an alphabet
        //System.out.println();
        //smallerLetter();
        //System.out.println();
        //biggerLetter();

        ans1.close();
    }

    static char smallerLetter() {
        char ch = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.println(ch);
            ch++;
        }
        return ch;
    }

    static char biggerLetter() {
        char ch = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.println(ch);
            ch++;
        }
        return ch;
    }

}

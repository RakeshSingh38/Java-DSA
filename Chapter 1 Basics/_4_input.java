import java.util.Scanner;
public class _4_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("Output is " + num * 2);

            float f = sc.nextFloat();
            System.out.println("float is "+f);

            byte by = sc.nextByte();
            System.out.println("byte is "+by);

            double d = sc.nextDouble();
            System.out.println("double is "+d);

            // boolean b = sc.nextBoolean();
            // System.out.println("boolean is "+b);

            short s = sc.nextShort();
            System.out.println("short is "+s);

            long l = sc.nextLong();
            System.out.println("long is "+l);

            System.out.print("enter a string");
            //    it takes only one word as input no matter how long the word is 
            // Q        why does it happen?
            //          the words we input are known as tokens and the next() takes only one token as input  so u will get only one word as output no matter how much the word is long
            //String str =sc.next();
            //System.out.print("string is "+str);

            String str2= sc.next();
            System.out.print("string is "+str2); 
            sc.close();
            // imp     better use this to close the scanner else vscode will suggest to bind the scanner in 
           //               try and resource brackets         

        }
    }

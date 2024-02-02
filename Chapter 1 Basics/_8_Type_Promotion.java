// imp      Type Promotion in Expressions

public class _8_Type_Promotion {
    public static void main(String[] args) {
        // 1 > Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
        // 2 > If one operand is long, float or double the whole expression is promoted to long, float, or double respectively.

        // ->     Examples
        // 1 >
      
        char a = 'a';
        char b = 'b';
        // to check value of a and b through type conversions (casting)
        System.out.println((int)(a));
        System.out.println((int)(b));

        System.out.println(b-a);
        // here it converts the char to int in ASCII table the values of a and b are 98 and 97
        //                                                                            b  -   a
        //                     so the answer is                                          1

        // ->     2 >
        // in second it converts the long , float or double value to the highest value

        int a_ = 12;
        float b_ = 12;
        short c= 35;
        double d = 52;
        long e = 45;
        
        // int ans= a_ + b_ + c + d + e;
                    int ans= (int)(a_ + b_ + c + d + e);
           //     by applying type conversion i get 156 as result
        System.out.println((int)(ans));
         // see       here highest value will be double
        // it wont convert it as its not possible u have to use 😉 type casting 😉 but it results in possible loss of info ( lossy conversion)

        // 
        byte f = 2;
        // byte g = g * 5;
        // there's a multiplication sign in between so java will automatically convert the g to int
        // to resolve it use type casting as byte

                byte g =(byte) (f * 5);
        // logically its not wrong but in java there's type promotion so it gives error
       // r     Use parenthesis  
            System.out.println("value g is "+g);
      
    }
}

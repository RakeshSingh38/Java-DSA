import java.util.Scanner;
public class _6_decimal_float_Q {
    public static void main(String[] args) {
        // r      in java if we dont defined a decimal its always taken as an double

        try (Scanner sc = new Scanner (System.in)) {
            float rad = sc.nextFloat();
            // float sum= 3.14 * f * f;
            // ->     Here it will show error 

            float sum= 3.14f * rad * rad;
            
            // ✅✅ now it will work without any issue
            System.out.println(" Area of circle is "+sum);
        }
    }
}

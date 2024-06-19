
public class _1_Couting_bits {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-9));
        // in 2's complement we first take 1's complement of the number and then add 0001 to it
        // -9 means 2's complement of 9 that is (1's complement) 0110 + 1 = 0111
        // so -9 in binary is 0111

        System.out.println(~1);
        // in ~ operator we first convert the number to 1's complement of it
        // that is our answer as i know the negative representation of a number in binary

        // Original number
        int originalNumber = 27; // Binary: 00011011

        // Create a mask for the lower 4 bits
        int mask = 0b00001111;

        // Apply the mask using bitwise AND
        @SuppressWarnings("unused")
        int result = originalNumber & mask;

        // Display the results
        //System.out.println("Original Number: " + Integer.toBinaryString(originalNumber));
        //System.out.println("Mask:             " + Integer.toBinaryString(mask));
        //System.out.println("Result:           " + Integer.toBinaryString(result) + " (Decimal: " + result + ")");
        @SuppressWarnings("unused")
        int i =7;
        System.out.println(1<<5);
        System.out.println();
    }

    //    public static int[] countBits(int n) {
    //
    //    }
}

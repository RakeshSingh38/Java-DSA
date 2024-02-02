
public class _2_Number_of_one_bits {
    public static void main(String[] args) {
        long n = 80L;
        long n2 = 4294967293L;
        long n3 = 11L;
        // to count trailing zeros we can use Integer.numberOfTrailingZeros(variablename)
        //System.out.println(Integer.toBinaryString((int) n));
        System.out.println("Case 1");
        System.out.println(numberOfOneBits((int) n3));
        System.out.println("Case 2");
        System.out.println(numberOfOneBits((int) n));
        System.out.println("Case 3");
        System.out.println(numberOfOneBits((int) n2));
    }

    public static int numberOfOneBits(int n) {
        // imp      direct returing the number of 1 bits in a number
        //return Integer.bitCount(n);
        //return Integer.toBinaryString(n).replaceAll("0", "").length();

        // imp      converting the number to binary string and then counting the number of 1's
        /*
        
         // Convert integer to binary representation
        String binaryRepresentation = Integer.toBinaryString(n);
        
         // Extract the binary representation as a string and count '1' bits
        return (int) binaryRepresentation.chars().filter(c -> c == '1').count();
        
         */
        int pos = 0;
        while (n != 0) {
            //System.out.println(Integer.toBinaryString(n<<1));
            n &= (n - 1);
            pos++;
        }
        return pos;

        /* imp      this apporoach uses the negative number i.e if the number is negative then the leading bit is 1
        // and counts it nice approach
        int counter = 0;
        while (n != 0){
            if (n < 0){ // as stated: in Java if the leading bit is 1 the number is negative 
                counter++; // count the number of times n becomes negative
            }
            n <<= 1;
        }
        return counter;
         */

        /* 
        
        Brian Kernighan's Algorithm:
        Initialize a count variable to 0.
        Iterate through each bit of the number using the following steps:
        If the current bit is 1, increment the count.
        Set the current bit to 0 using the expression n = n & (n - 1).
        The count variable now holds the number of 1 bits.
        
        Complexity
        ⏱️ Time Complexity: O(k), where k is the number of set bits in the binary representation of the number.
        
        🚀 Space Complexity: O(1)
         */
    }
}

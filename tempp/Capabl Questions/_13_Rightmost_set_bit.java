/**
 * _13_Rightmost_set_bit
 */
public class _13_Rightmost_set_bit {

    public static void main(String[] args) {
        System.out.println(rightmostDifferentBitPosition(15, 11));
    }

    static int rightmostDifferentBitPosition(int n, int m) {

        /*         int xorResult = m ^ n;
        int position = 1;
        
        // If the numbers are the same, print -1
        if (xorResult == 0) {
            return -1;
        } else {
            // Find the position of the rightmost set bit in the XOR result
            while ((xorResult & 1) == 0) {
                xorResult = xorResult <<  1;
                position++;
            }
        
            return position;
        }
        */

        int pos = 1;
        //m = 1;
        while ((n & m) == 0) {
            m = m << 1;
            pos++;
        }
        //if ((n & m) != 0)
        return pos;
        //else
        //return -1;
    }
}
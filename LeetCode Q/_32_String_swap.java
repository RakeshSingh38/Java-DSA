public class _32_String_swap {
    public static void main(String[] args) {
        System.out.println(StringSwap("bank", "kanb"));
    }

    private static boolean StringSwap(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int first = -1, second = -1;
        char[] arr = s1.toCharArray(); // Convert string to character array for swapping

        // Find mismatched positions
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false; // More than 2 mismatches → can't swap 
                }
            }
        }

        // If exactly 2 mismatches, swap them
        if (first != -1 && second != -1) {
            char temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

        // Check if swapping made them equal
        return new String(arr).equals(s2);
    }
}
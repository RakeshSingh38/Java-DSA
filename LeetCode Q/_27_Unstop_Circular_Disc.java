import java.util.*;

public class _27_Unstop_Circular_Disc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //int count = 0;
        System.out.println("ss");

        Arrays.sort(s.toCharArray());
        

        // or

        // imp      both are same
        //char[] charArray = s.toCharArray();
        //Arrays.sort(charArray);

        /*   for (int i = 0; i < charArray.length; i++) {
            //if (Character.isLetter(s.charAt(i))) {
            //    count++;
            //}
            if (Character.toLowerCase(s.charAt(i)) >= 'a' && Character.toLowerCase(s.charAt(i)) <= 'z') {
                count++;
            }
        
            //System.out.print(s);
        }*/
        ////System.out.println(Arrays.toString(charArray));
        //System.out.println(new String(charArray));
        //System.out.println(count);
        System.out.println(CircularDiscCount(s));
        sc.close();
    }

    static int isStringUnstoppable(String st) {
        char[] charArray = st.toCharArray();
        Arrays.sort(charArray);

        int s = 0;
        int e = charArray.length - 1;
        int count = 0;
        while (s < e) {
            int i = s; // declare the variable 'i'
            if (Character.toLowerCase(st.charAt(i)) >= 'a' && Character.toLowerCase(st.charAt(i)) <= 'z') {
                count++;
            }
            s++;
            e--;
            count++;
        }
        return count;
    }

    static int CircularDiscCount(String s) {
        // Sort the string
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        // Start with the pointer on 'a'
        char currentPosition = 'a';
        int totalSeconds = 0;

        // Iterate over each character in the sorted array
        for (char ch : chars) {
            // Calculate the clockwise and counterclockwise distance
            int clockwise = Math.abs(ch - currentPosition);
            int counterclockwise = 26 - clockwise;
            
            // Add the minimum of the two distances to the total time
            totalSeconds += Math.min(clockwise, counterclockwise);

            // Add 1 second for typing the character
            totalSeconds += 1;

            // Move the pointer to the current character
            currentPosition = ch;
        }

        // Print the total time
        //System.out.println(totalSeconds);
        return totalSeconds;
    }
}
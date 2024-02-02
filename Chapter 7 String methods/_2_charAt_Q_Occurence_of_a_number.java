
public class _2_charAt_Q_Occurence_of_a_number {
    // imp      it only takes a single value
    public static void main(String[] args) {
        // Program to find occurence of a Character
        String str = "Rakesh Singh k k k k k ";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'k') {
                count++;
            }
        }
        System.out.println(count);
    }
}

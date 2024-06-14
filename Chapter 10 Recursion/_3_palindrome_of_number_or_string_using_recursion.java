
public class _3_palindrome_of_number_or_string_using_recursion {
    public static void main(String[] args) {
        char ch[] = { 'm', 'a', 'd', 'a', 'm'};
        System.out.println(isPalindrome(ch, 0, ch.length - 1));
        //System.out.println("Max Heap Size (Xmx): " + Runtime.getRuntime().maxMemory() / (1024 * 1024) + " MB");
        //System.out.println("Max Heap Size (Xmx): " + Runtime.getRuntime().maxMemory() / (1024 * 1024) + " MB");
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Max Heap Size (Xmx): " + (maxMemory / (1024 * 1024)) + " MB");

        // Print the initial heap size (Xms)
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("Initial Heap Size (Xms): " + (totalMemory / (1024 * 1024)) + " MB");
    }

    private static boolean isPalindrome(char ch[], int s, int e) {
        if (s == e || s > e){
            System.out.println("okay");
            return true;
        }

        if (ch[s] == ch[e]) {
            boolean temp = isPalindrome(ch, s + 1, e - 1);
            return temp;
        } else {
            return false;
        }
    }
}


public class _11_trim {
    public static void main(String[] args) {
        // trim method
        // The trim() method removes whitespace from both ends of a string.

        String myStr = "         Hello World!       ";
        System.out.println("\nOriginal string is : " + myStr);
        System.out.println();
        System.out.println("Trimmed string is : " + myStr.trim());

        System.out.println("\t\nThis method does not change the original string ");
        System.out.println(myStr);
        System.out.println();
        String hey = (myStr.trim());
        System.out.println(hey.toUpperCase());
    }
}

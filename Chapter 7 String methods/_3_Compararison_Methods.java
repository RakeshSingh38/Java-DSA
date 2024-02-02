//syntax
// public int compareTo(String string2)
// public int compareTo(Object object)

// imp       either both will be string or object
public class _3_Compararison_Methods {
    public static void main(String[] args) {
        String str1 = "Rakesh";
        String str2 = "Rakesh";
        System.out.println(str1.compareTo(str2));

        /* An int value: 0 if the string is equal to the other string.
        < 0 if the string is lexicographically less than the other string
        > 0 if the string is lexicographically greater than the other string (more characters) */

        System.out.println(str1.equals(str2));
        // imp      equals() method to compare two strings without consideration of Unicode values.

        System.out.println(str1.compareToIgnoreCase(str2));
        // imp       compareToIgnoreCase() to compare two strings lexicographyically, ignoring lower case and upper case differences.
    }
}

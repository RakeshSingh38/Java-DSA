// tip      In Java Strings are immutable i.e Unchangeable
public class _9_replace {
    public static void main(String[] args) {
        String myString = "Rakesh";
        // replaces whole string with a specified character
        //                                Target   replacement value
        //                                   ↓      ↓
        System.out.println(myString.replace("Ra", "Ni"));
        // replaces 1st letter with a specified character
        System.out.println(myString.replaceFirst(myString, "A"));

        // same as replace
        System.out.println(myString.replaceAll(myString, "A"));

    }
}

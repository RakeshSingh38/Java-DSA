// i used the class Books to create an array of objects of type Books
public class _3_books {
    String title;
    String author;

    public static void main(String[] args) {
        // create an array of objects of type Books ( 3 )
        var myBooks = new _3_books[3];
        int x = 0;

        // uncomment and still it will work

        myBooks[0] = new _3_books();
        myBooks[1] = new _3_books();
        myBooks[2] = new _3_books();

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
//        int x1 = 0;
//        int x2 = 2;
//
//        System.out.println(x1);
//        System.out.println(x2);
//
//        System.out.println("printName() method");
//        //System.out.println(printName("Rakesh", "Kumar"));
//        String name = printName("Rakesh", "Kumar");
//        System.out.println(name);
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }

    //public static String printName(String fName, String lName) {
    //    return fName + lName;
    //}
}

interface MyLambda {
    public void display(String s);
}
// 4 Method Reference 6:21
public class _4_Lambda_Method_Reference {
    public static void main(String[] args) {
        MyLambda obj = System.out::println;

        // syntax is

        // interface name = class name :: method name   
        MyLambda ans = _4_Lambda_Method_Reference::reverse;
        obj.display("world"); // ✅✅

        ans.display("Hello world"); // ✅✅
        //System.out.println(ans);  // ❌❌

        // or

        // fix          to make it work we have to make remove the static keyword from the method reverse
        var lex = new _4_Lambda_Method_Reference();
        MyLambda ans2 = lex::reverse2;

        ans2.display("heyy");
    }

    public static void reverse(String str) {
        var sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public void reverse2(String str) {
        var sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}

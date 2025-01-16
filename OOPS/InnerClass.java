class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        var myOuter = new OuterClass();
        var myInner = myOuter.new InnerClass();
        //or
        //OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

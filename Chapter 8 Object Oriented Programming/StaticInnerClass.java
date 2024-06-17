class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class StaticInnerClass {w
    public static void main(String[] args) {
        var myOuter = new OuterClass();
        var myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y + myOuter.x);
        // or
        System.out.println(new OuterClass.InnerClass().y + myOuter.x);
    }
}

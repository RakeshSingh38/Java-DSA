//package OOPS;

public class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }

}

public class StaticInnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        var myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y + myOuter.x);
        // or
        System.out.println(new OuterClass.InnerClass().y + myOuter.x);
    }
}

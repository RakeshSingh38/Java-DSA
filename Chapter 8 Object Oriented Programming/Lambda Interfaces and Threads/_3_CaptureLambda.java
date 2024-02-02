interface MyLambda {
    public void display();
}

class UseLambda {
    // function to call lambda
    public void callLambda(MyLambda ml) {
        ml.display();
    }
}

class Demo {
    int test = 20;

    public void method1() {
        // calling lambda using the function where it is declared i.e UseLambda
        var ul = new UseLambda();
        ul.callLambda(() -> {
            System.err.println("Hello");
        });
    }

    int temp = 10;

    public void method2() {
        int count = 0;

        MyLambda ml2 = () -> {
            // lambda can access only final variables
            // lambda expression can have local variables and they can access it
            int count1 = 1;
            //count++;
            int x = 0;
            System.out.println("Hi");
            x++;

            // count is final , it cannot be modified but only can be accessed
            // lambda can access only local method variables but cannot modify it as it is final for lambda expressions
            System.out.println(count); // ✅✅
            // System.out.println(++count); ❌❌
            System.out.println(x);
            System.out.println(test);
            System.out.println(++count1);
            System.out.println("Bye" + (++temp));
        };
        // same as hosting in js (its final)
        //count++;
        ml2.display();
    }
}

public class _3_CaptureLambda {

    public static void main(String[] args) {
        var d = new Demo();
        d.method1();
        d.method2();
    }

}
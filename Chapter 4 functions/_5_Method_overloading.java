public class _5_Method_overloading {

    // imp      With method overloading, multiple methods can have the same name with
    // different parameters

    static int myMethod(int x, int y) {
        return x + y;
    }

    static float myMethod(float x, float y) {
        return x + y;
    }

    static double myMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int ans1 = myMethod(12, 10);

        // ->        variable should be according to the type
        float ans2 = myMethod(52, 60);
        double ans3 = myMethod(44444444, 86666666);
        System.out.println(" int is " + ans1);
        System.out.println(" float is " + ans2);
        System.out.println(" double is " + ans3);
    }
}

public class _8_patterns_Q {
    // imp     logic is  star <= n - line + 1 
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i + 1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

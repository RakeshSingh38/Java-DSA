public class max {
    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 3, 2, 6, 8 };
        int[] b = { 5, 9, 3, 1, 4, 5, 2 };
        int maxA = a[0];
        int maxB = b[0];
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxA) {
                maxA = a[i];
            }
        }
        
        for (int i = 1; i < b.length; i++) {
            if (b[i] > maxB) {
                maxB = b[i];
            }
        }
        System.out.println(maxA);
        System.out.println(maxB);
        int result = Math.max(maxA, maxB);
        System.out.println(result);
    }
}

public class _5_Consecutive_Same_Integers_3_times {
    static String hasConsecutiveSameIntegers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length-1) {
                System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
            if (arr[i] == arr[i + 1] && arr[i + 1] == arr[i + 2]) {
                return "Yes";
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        //int size = scanner.nextInt();
        int[] array = { 1, 5, 7,8,5,5 ,5 };
        //for (int i = 0; i < size; i++) {
        //    array[i] = scanner.nextInt();
        //}
        String result = hasConsecutiveSameIntegers(array);
        System.out.println(result);
        //String hi = ("1 5 4 5  8 4 5   6 3 2 7 5 7 5 2 5  5 5");
        //System.out.println(hi);
    }
}

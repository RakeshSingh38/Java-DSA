import java.util.Arrays;

public class tempppp {
    public static void main(String[] args) {
        int[] arr = { 9, 9, 9 };

        System.out.println(Arrays.toString(N_PLus_one(arr)));
    }

    public static int[] N_PLus_one(int[] arr) {
        int n = arr.length;

        // imp     if no. is less than 9 
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            // if no. is 9 then replace it with 0 and move to next number
            arr[i] = 0;
        }

        // imp      for the case when all digits are 9
        int newArr[] = new int[n + 1];
        newArr[0] = 1;
        //return new int[] { -1, -1 };
        return newArr;
    }
}

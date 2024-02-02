public class _7_find_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int N = arr.length;
        System.out.println(search(arr, N, 3));
    }

    static int search(int arr[], int N, int X) {

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == X) {
                arr[i] = i;
                return arr[i];
            }
        }
        return -1;
    }
}

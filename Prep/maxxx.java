// imp          prep
public class maxxx {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sum) {
                sum = arr[i];
            }
        }
        System.out.println(sum+"\n");
        System.out.print("Before Swapping: ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[3]);
        //System.out.println(sum);
        swap(arr);
        System.out.print("\n\nAfter Swapping: ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[3]);
        System.out.println("\n");
    }

    static void swap(int[] arr) {
        int temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
    }
}

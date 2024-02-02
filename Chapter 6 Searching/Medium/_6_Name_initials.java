
public class _6_Name_initials {
    public static void main(String[] args) {
        String name = "Rakesh Singh";
        String initials = getInitials(name);
        System.out.println(initials);

        int arr[] = { 1, 6, 9, 4, 12, 5, 8 };
        filterElements(arr);
    }

    private static String getInitials(String fullName) {
        String[] arr = fullName.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String s : arr) {
            initials.append(s.charAt(0)).append(".");
        }
        return initials.toString().toUpperCase();
    }

    static long calculateFactorial(int n) {
        if (n == 0)
            return 1;
        return n * calculateFactorial(n - 1);
    }

    static int calculateNthTerm(int a, int r, int n) {
        return (int) (a * Math.pow(r, n - 1));
    }

    public void run() {
        int n = 5;
        int a = 2;
        int r = 2;
        int nthTerm = calculateNthTerm(a, r, n);
        System.out.println(nthTerm);
        System.out.println();
    }

    public static void filterElements(int[] arr) {

        // filter elements that are divisible by 3 and 2

        // write the code here

        int writeIndex = 0; // Index for writing non-divisible elements back to the original array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 || arr[i] % 3 != 0) {
                // If the element is not divisible by both 2 and 3, keep it in the array
                arr[i] = arr[i];
                writeIndex++;
            }
            // If divisible by both 2 and 3, skip it
            // If divisible by both 2 and 3, skip it
        }
        // write alterate code of below line
        //
        int[] newArr = new int[writeIndex];
        for (int i = 0; i < writeIndex; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;

        // Resize the array to remove the elements that were divisible by both 2 and 3
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        //System.out.println(Arrays.toString(arr));
    }
}

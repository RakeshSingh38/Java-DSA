
/**
 * Practisee
 */

public class Practisee {
    public static int findMajorityElement(int[] arr, int x, int y) {
        int n = arr.length;
        int[] freq = new int[Math.max(x, y) + 1]; // Temporary array to store frequency

        // Count the frequencies of x and y in the array
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                freq[arr[i]]++;
                if (freq[arr[i]] == 1) {
                    count++;
                }
            }
        }
        // Return the element which is occurring more number of times
        if (count == 2) {
            if (freq[x] == freq[y]) {
                return Math.min(x, y);
            } else {
                return (freq[x] > freq[y]) ? x : y;
            }
        } else if (count == 1) {
            return (freq[x] == 1) ? x : y;
        } else {
            return -1; // Indicates x and y are not present in the array
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 4, 4, 4, 2, 3, 4, 5, 54, 3, 2, 2, 3, 43, 4, 55, 6, 5, 5, 5 };
        int x = 4;
        int y = 5;
        System.out.println(findMajorityElement(arr, x, y)); // Output: 2
    }

}
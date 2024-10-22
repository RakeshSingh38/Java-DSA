//import java.util.*;
public class _31_Book_allocation{

    // Helper function to check if it's possible to allocate books
    static boolean isPossible(int[] arr, int n, int m, int maxPages) {
        int studentCount = 1;  // Count of students required
        int sumPages = 0;  // Sum of pages currently allocated to a student

        for (int i = 0; i < n; i++) {
            sumPages += arr[i];

            // If adding this book exceeds maxPages, allocate to a new student
            if (sumPages > maxPages) {
                studentCount++;  // Increment student count
                sumPages = arr[i];  // Start a new sum for the new student

                // If student count exceeds given m, return false
                if (studentCount > m) {
                    return false;
                }
            }
        }
        return true;
    }

    // Function to find the minimum pages that can be allocated
    static int findPages(int[] arr, int n, int m) {
        if (n < m) {
            return -1;  // Not enough books for each student
        }

        int maxElement = 0, totalPages = 0;
        for (int i = 0; i < n; i++) {
            maxElement = Math.max(maxElement, arr[i]);  // Maximum of book sizes
            totalPages += arr[i];  // Total sum of pages
        }

        int start = maxElement, end = totalPages, result = -1;

        // Binary search to find the minimum possible maximum number of pages
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(arr, n, m, mid)) {
                result = mid;  // Store the minimum possible max pages
                end = mid - 1;  // Try for a smaller maximum
            } else {
                start = mid + 1;  // Try for a larger maximum
            }
        }
        return result;
    }

    // Test case
    public static void main(String[] args) {
        // Test case input: 7 7
        // Array of pages: 1 17 14 9 15 9 14
        int[] pages = {1, 17, 14, 9, 15, 9, 14};
        int n = pages.length;
        int students = 7;

        int result = findPages(pages, n, students);
        System.out.println("Minimum number of pages that can be allocated: " + result);
    }
}


// imp      program to print Matrix in Wave form

//import java.util.Scanner;

public class _9_2d_array_print_wave_form {
    public static void main(String[] args) {
        int n = 4, m = 5;
        //Scanner sc = new Scanner (System.in);
        //int input = sc.nextInt();

        int[][] arr = {
                { 10, 20, 30, 40, 50 },
                { 60, 70, 80, 90, 100 },
                { 110, 120, 130, 140, 150 },
                { 160, 170, 180, 190, 200 }
        };

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

import java.util.*;

public class _5_Spiral_Matrix_II {
    public static void main(String[] args) {
        int[][] n = new int[3][3];
        List<Integer> list = new ArrayList<>();
        //int size = n.length;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                list.add(n[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}

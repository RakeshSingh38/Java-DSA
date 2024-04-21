public class Diamond {
    public static void main(String[] args) {
        int n = 5;
        int star = (n/2)+1;
        int space = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= star; l++) {
                System.out.print("*");
            }
            if (i < n / 2) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
            System.out.println();
        }
    }
}
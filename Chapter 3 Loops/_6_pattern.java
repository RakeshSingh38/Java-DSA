import java.util.Scanner;

public class _6_pattern {
    public static void main(String[] args) {

        for (int line = 1; line <= 4; line++) {
            System.out.println("****");
        }
        int rows, columns;
        String symbol;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        rows = sc.nextInt();
        System.out.print("Enter number of Columns : ");
        columns = sc.nextInt();
        System.out.print("Enter Symbol to use : ");
        symbol = sc.next();
        patterns(rows, columns, symbol);

        sc.close();
    }

    static void patterns(int rows, int columns, String symbol) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number of Rows");
        //rows = sc.nextInt();
        //System.out.println("Enter number of Columns");
        //columns = sc.nextInt();
        //System.out.println("Enter Symbol to use");
        //symbol = sc.next();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println("");
        }

    }
}

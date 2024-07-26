import java.util.*;
import java.util.function.BiFunction;

public class _10_caluculator_using_hashMap {
    public static void main(String[] args) {
        System.out.println("Press 0 to exit");

        boolean exit = true;

        Map<Character, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();

        System.out.println(operations);

        operations.put('+', (a, b) -> a + b);
        operations.put('-', (a, b) -> a - b);
        operations.put('*', (a, b) -> a * b);
        operations.put('/', (a, b) -> a / b);
        operations.put('%', (a, b) -> a % b);

        Scanner sc = new Scanner(System.in);

        while (exit) {
            System.out.println("Enter two digits : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("Enter Operator : ");
            // we will only read the 1st character 
            char operator = sc.next().charAt(0);

            System.out.println();

            if (operator == '0') {
                exit = false;
            } else if (operations.containsKey(operator)) {
                System.out.println(operations.get(operator).apply(a, b));
            } else {
                System.out.println("Unknown Symbol");
            }
        }
        // tip      scanner should be outside of this loop else it will be closed
        sc.close();

    }
}

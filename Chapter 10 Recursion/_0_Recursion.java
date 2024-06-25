import java.util.Stack;

public class _0_Recursion {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int sum = sum(5);
        //System.out.println(sum);
        @SuppressWarnings("unused")

        int fact = fact(3);
        @SuppressWarnings("unused")

        //System.out.println(fact);

        int fibbonacci = fib(4);
        //System.out.println(fibbonacci);

        printNumber(5);
    }

    private static void printNumber(int n) {
        //This means that when n becomes 0, the function will stop calling itself and start to unwind. 
        //The unwinding process will then execute the System.out.print(n + " ");
        if (n == 0) {
            return;
        }
        // During this unwinding process, any code in the function that comes after the recursive call is executed
        /*  
        // imp      Unwinding
        the process of returning from the recursive calls and reaching the base case. The base condition is the condition under which the recursion stops, preventing the function from making further recursive calls.
         */
        printNumber(n - 1);
        // once the above lines are executed then the next lines such as sop(n) will be printed
        // this where the recursion stops and hence prevent to call the function again and again
        //int temp  = factoriall(5);

        System.out.print(n + " ");
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int temp = sum(n - 1);

        return temp + n;
    }

    static int fact(int n) {

        if (n == 1)
            return 1;
        int temp = fact((n - 1));

        return temp * n;
    }

    static int factoriall(int n) {
        // using iterative method
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }   

    public static void sortStack(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }
        int temp = stack.pop();
        sortStack(stack);
        sortedInsert(stack, temp);

        
    }

    static void sortedInsert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }
    }
}

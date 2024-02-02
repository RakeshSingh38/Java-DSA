public class _6_scope {
    // imp   Java Scope
    // In Java, variables are only accessible inside the region they are created.
    // This is called scope.
    public static void main(String[] args) {

        {
            int x = 60;
            // x =60;
            System.out.println(x);
        }
        // r     its a block scope so its life is limited to the scope only

        // it wont work outside the scope { }

        // System.out.println(x);

        // see   A block of code may exist on its own or it can belong to an if, while or
        // for statement.
        // In the case of for statements, variables declared in the statement itself
        // are also available inside the block's scope.

    }
}

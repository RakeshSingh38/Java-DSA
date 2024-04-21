public class Main {
    // local vs global variable

    // global variable
    //static int x = 5;
    public static void main(String[] args) {
        // local variable
        //int x = 10;
        //System.out.println(x);

        // look into this to know more about local and global variables
        Ludo ludo = new Ludo();
        System.out.println("" + ludo);
        
        System.out.println();

        
        // indvidual local variable
        Local local = new Local();
        System.out.println("\n" + local);
        // indvidual global variable
        Global global = new Global();
        System.out.println("\n" + global);

        //System.out.println(ludo);
    }
}

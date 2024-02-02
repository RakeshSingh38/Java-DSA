public class _13_Shadowing {
    static int x = 50;
    public static void main(String[] args) {
        System.out.println(x);
        // int x =21;

        // class variable at line 2 is shadowed by this
        int x; // see     1 > initialize
        
        x= 21; // see     2 > use 
        
        System.out.println(x);
        num();
    }
    static void num(){
        System.out.println(x); 

        // ->     here staic int value will be applied 
    }
}

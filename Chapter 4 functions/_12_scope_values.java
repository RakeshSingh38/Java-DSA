public class _12_scope_values {
    
    public static void main(String[] args) {
     int a=10;   // see    1 >  initialized 
     int b=20;
     {
        // ->     values initalized in this block will stay inside , read again the initalized

        // w     int a = 90;   its wrong as its already exist , u can only change the value of it 
        //                      in case int a =90; is declared then its life is limited to this block only
        //                      it wont show elsewhere

        a=90;  // see     2 > updating

        // imp     re-assigning the original ref value to some other value

             System.out.println(a);
            // r     above code will print a here and outside too  


            int c=55;
            System.out.println("value of c inside block is "+c);
     }
     System.out.println(a);
     System.out.println(b); 
     int c=60; 
                 System.out.println("value of c outside block is "+c);

   }
    // static void change(num){
    //     // int num=10;
    //     // System.out.println(a);
    // }
}

public class _3_Function_p_a {

    static void fullName(String fName){
//                          ↑     ↑
//                          |_____|
//                             ↓ 
//                         Parameters
// imp              which type of data is passed 

        System.out.println(fName+" Singh");
    }
    public static void main(String[] args) {
        fullName("Rakesh");
//                  ↑
//              Arguments
        fullName("Nikesh");
//                  ↑
//              Arguments
        fullName("Sukesh");
//                  ↑
//              Arguments
        fullName("Mukesh");
//                  ↑
//              Arguments

// imp          what data is passed is known as arguments
    }
}

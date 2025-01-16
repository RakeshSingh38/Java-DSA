public class practise {
    int x= 12;
    String car = "Out of Class";
    public static void main(String[] args) {
        var audi = new practise();
        System.out.println(audi.car);
        System.out.println();
        var tata = new practise();
        audi.car="In the main";
        System.out.println(audi.car);
        System.out.println();
        tata.car = "hey";
        System.out.println(tata.car);
        tata.x=14;
        System.out.println(tata.x);
        tata.car="hi";
        System.out.println(tata.car);
        tata.x=12;
        System.out.println(tata.x);
        
    }
}

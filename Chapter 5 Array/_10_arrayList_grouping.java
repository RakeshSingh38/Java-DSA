import java.util.ArrayList;

public class _10_arrayList_grouping {
    public static void main(String[] args) {
        // imp          to group below items use below line

        //  Step 1 add below line
        ArrayList<ArrayList<String>> Company = new ArrayList<>();

        ArrayList<String> Shop = new ArrayList<>();
        Shop.add("Chicken");
        Shop.add("Mutton");
        Shop.add("Shawarma");
        //System.out.println(Shop.get(0));

        ArrayList<String> Products = new ArrayList<>();

        Products.add("Chicken");
        Products.add("Mutton");
        Products.add("Shawarma");

        ArrayList<String> Logistics = new ArrayList<>();

        Logistics.add("Truck");
        Logistics.add("Train");
        Logistics.add("Aeroplane");

        // step 2  adding groups
        Company.add(Shop);
        Company.add(Products);
        Company.add(Logistics);

        // step 3 displaying
        // see      to get first element i.e Shop -> All items will be shown
        System.out.println((Company.get(0)));

        // Q          what if u want Chicken from Shop ? do this
        System.out.println((Company.get(0).get(0)));


        // tip      to print the Company which groups whole lists i need to use a temport ArrayList to print it
        //  to Print Group of ArrayList use a Temporary ArrayList in forEach loop
        for (ArrayList<String> list : Company) {
            System.out.println(list);
        }
    }
}

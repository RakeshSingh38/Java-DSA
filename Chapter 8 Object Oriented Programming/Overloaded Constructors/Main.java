 class Main_constructor {
    // overloaded constructor
    // they have same name but different parameters
    public static void main(String[] args) {
        //String shopType, String dish, String drink, int price
        Restraunt newShop1 = new Restraunt("Non-veg", "Chicken");

        // tip    if there are no arguments then it will show null
        // i,e
        /* 
        Shop() {
        
        }
         */
        //Shop newShop = new Shop("Non-veg", "Chicken");
        //Shop newShop = new Shop("Non-veg", "Chicken", "Coke");
        //Shop newShop = new Shop("Non-veg", "Chicken", "Coke", 100);

        // Q     what if i pass 3 arguments instead of 4? 
        // r       the String argument will be null and integer will be 0

        System.out.println(newShop1);
        //System.out.println("List of items in the shop: " + newShop.dish + "\n, " + newShop.drink + "\n," + newShop.price);
        System.out.println("List of items in the shop: ");
        System.out.println("Shop type: " + newShop1.shopType);
        System.out.println("Dish: " + newShop1.dish);
        System.out.println("Drink: " + newShop1.drink);
        System.out.println("Price: " + newShop1.price);

        //newShop.shopType = "Restaurant";
    }
}

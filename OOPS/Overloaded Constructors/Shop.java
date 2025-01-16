public class Shop {
    String shopType;
    String dish;
    String drink;
    int price;

    Shop() {
        this.shopType = "Restaurant";
    }

    Shop(String shopType) {
        this.shopType = shopType;
    }

    Shop(String shopType, String dish) {
        this.shopType = shopType;
        this.dish = dish;

    }

    Shop(String shopType, String dish, String drink) {
        this.shopType = shopType;
        this.dish = dish;
        this.drink = drink;
    }

    Shop(String shopType, String dish, String drink, int price) {
        this.shopType = shopType;
        this.dish = dish;
        this.drink = drink;
        this.price = price;
    }



    public void customerEats() {
        System.out.println("Customer eats " + dish);
            System.out.println("Customer likes " + dish + " taste\nCustomer prefers" + drink);
    }

    public void customerPays() {
        System.out.println("customer pays " + price + " rupees");
    }
}

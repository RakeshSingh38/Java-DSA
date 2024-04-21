public class Shop {
    String shopType;
    String dish;
    String drink;
    int price;

    Shop(){

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
}

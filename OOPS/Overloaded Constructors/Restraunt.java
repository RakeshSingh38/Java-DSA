public class Restraunt {
    String shopType;
    String dish;
    String drink;
    int price;

    Restraunt(String shopType) {
        this.shopType = shopType;
    }

    Restraunt(String shopType, String dish) {
        this.shopType = shopType;
        this.dish = dish;

    }

    Restraunt(String shopType, String dish, String drink) {
        this.shopType = shopType;
        this.dish = dish;
        this.drink = drink;
    }

    Restraunt(String shopType, String dish, String drink, int price) {
        this.shopType = shopType;
        this.dish = dish;
        this.drink = drink;
        this.price = price;
    }
}

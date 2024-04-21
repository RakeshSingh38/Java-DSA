public class Shop {
    String shopType;
    String dish;
    String drink;
    int price;
    public String dishName;
    public String taste;
    public String type;

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
    public void customerEats() {
        throw new UnsupportedOperationException("Unimplemented method 'customerEats'");
    }
    public void customerPays() {
        throw new UnsupportedOperationException("Unimplemented method 'customerPays'");
    }
}

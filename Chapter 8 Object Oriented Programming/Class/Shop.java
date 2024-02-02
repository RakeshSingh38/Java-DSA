
public class Shop {
    String dishName = "Chicken Briyani";
    String taste = "Spicy";
    String type = "non-veg";
    double price = 150;

    public void customerEats() {
        System.out.println("Customer eats " + dishName);
        System.out.println("Customer likes " + taste + " taste\nCustomer prefers" + type);
    }

    public void customerPays() {
        System.out.println("customer pays " + price + " rupees");
    }
}

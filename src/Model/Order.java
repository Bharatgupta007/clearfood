package Model;

public class Order {

    public String restaurantName;
    public int quantity;
    public double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order(String restaurantName, int quantity, double totalPrice) {
        this.restaurantName = restaurantName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString(){
        return "Order from " +  restaurantName + " with quantity "
                + quantity + " with total price as " + totalPrice;
    }
}

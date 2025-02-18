package Service;

import Model.Order;
import Model.Restaurent;

import java.util.HashMap;

public class OrderService {

    public void placeOrder(UserService userService, RestaurantService restaurantService,
                    String name, int quantity){
        Restaurent restaurant = restaurantService.restaurentMap.get(name);
        if(restaurant != null && restaurant.quantity >= quantity){
            restaurant.updateQuantity(-quantity);
            Order order = new Order(name, quantity, restaurant.price * quantity);
            userService.loggedInUser.orderHistory.add(order);
            System.out.println("Order placed successfully");
        }
        else {
            System.out.println("Cannot place order");
        }
    }
}

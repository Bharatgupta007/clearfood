import Service.OrderService;
import Service.RestaurantService;
import Service.UserService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        RestaurantService restaurantService = new RestaurantService();
        OrderService orderService = new OrderService();

        userService.registerUser("Bharat", "M",
                1234567890, "HSR");
        userService.registerUser("ABCD", "M",
                12341234, "BTM");

        userService.loginUser(1234567890);

        restaurantService.registerRestaurant("ABC",
                "Pizza", "HSR", 100, 10);
        restaurantService.registerRestaurant("Meghana",
                "Biryani", "HSR", 400, 10);
        restaurantService.registerRestaurant("DEF",
                "Burger", "BTM", 50, 1);


        System.out.println("Showing res without rating");
        restaurantService.showRestaurant("price", userService.loggedInUser.getPincode());
        System.out.println("-------------------------------");

        System.out.println("Placing Order");
        orderService.placeOrder(userService, restaurantService, "ABC", 2);
        orderService.placeOrder(userService, restaurantService, "Meghana", 1);
        System.out.println("-------------------------------");

        restaurantService.createReview("ABC", 5, "Good");

        restaurantService.createReview("ABC", 3);

        restaurantService.createReview("Meghana", 5, "Good");

        System.out.println("Showing user order history");
        userService.loggedInUser.showOrderHistory();
        System.out.println("-------------------------------");


        System.out.println("Showing res on the basis of price asc");
        restaurantService.showRestaurant("price", userService.loggedInUser.getPincode());
        System.out.println("-------------------------------");

        System.out.println("Showing res on the basis of rating dsc");
        restaurantService.showRestaurant("rating", userService.loggedInUser.getPincode());
        System.out.println("-------------------------------");


















    }
    }
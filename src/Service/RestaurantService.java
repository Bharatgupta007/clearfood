package Service;

import Model.Restaurent;

import java.util.*;

public class RestaurantService {

    Map<String, Restaurent> restaurentMap = new HashMap<>();

    public void registerRestaurant(String name, String foodItem, String pincode, int price, int quantity){
        restaurentMap.put(name, new Restaurent(name, foodItem, pincode, price, quantity));
    }

    public void updateQuantity(String name, int quantity){
        if(restaurentMap.containsKey(name)){
            restaurentMap.get(name).updateQuantity(quantity);
        }
    }

    public void createReview(String name, int rating, String comment){
        if(restaurentMap.containsKey(name)){
            restaurentMap.get(name).addReview(rating, comment);
        }
    }

    public void createReview(String name, int rating){
        if(restaurentMap.containsKey(name)){
            restaurentMap.get(name).addReview(rating, "No comment");
        }
    }

    public void showRestaurant(String sortBy, String userPincode){
        List<Restaurent> list = new ArrayList<>(restaurentMap.values());
        list.removeIf(restaurent -> !restaurent.servicablePincode.contains(userPincode));
        if(sortBy.equals("price")){
            list.sort(Comparator.comparingInt(r -> r.price));
        }
        else{
            list.sort((r1, r2) -> Double.compare(r2.getAverageRating(), r1.getAverageRating()));
        }
        list.forEach(r -> System.out.println(r.name + " " + r.foodItem + " " + r.price + " " + r.getAverageRating()));
    }























}


package Model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Restaurent {

    public String name;
    public String foodItem;
    public Set<String> servicablePincode;
    public int price;
    public int quantity;
    public double totalRating=0;
    public int ratingCount=0;

    public Restaurent(String name, String foodItem, String pincode, int price, int quantity) {
        this.name = name;
        this.foodItem = foodItem;
        this.price = price;
        this.quantity = quantity;
        this.servicablePincode = new HashSet<>(Arrays.asList(pincode.split("/")));
    }
    public void updateQuantity(int quantity){
        this.quantity += quantity;
    }
    public void addReview(int rating, String comment){
            totalRating += rating;
            ratingCount++;
    }
    public double getAverageRating(){
        return ratingCount == 0 ? 0 : totalRating/ratingCount;
    }

}

//Select restaurant_id, AVG(rating) as average
//FROM rating_table
//WHERE restaurant_id = restaurant_id
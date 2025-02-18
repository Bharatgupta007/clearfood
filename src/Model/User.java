package Model;


import java.util.ArrayList;
import java.util.List;

public class User {

    public List<Order> orderHistory = new ArrayList<>();

    public String name;
    public String gender;
    public int number;
    public String pincode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public User(String name, String gender, int number, String  pincode){

        this.name = name;
        this.gender = gender;
        this.number = number;
        this.pincode = pincode;
    }

    public void showOrderHistory(){
        for (Order order: orderHistory){
            System.out.println(order);
        }
    }
}

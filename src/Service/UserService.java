package Service;

import Model.User;

import java.util.HashMap;

public class UserService {

    HashMap<Integer, User> userInfo = new HashMap<>();

    public User loggedInUser;

    public void loginUser(int number){
        if(userInfo.containsKey(number)){
            loggedInUser  = userInfo.get(number);
        }
    }

    public void registerUser(String name, String gender,
                      int number, String pincode){
        userInfo.put(number, new User(name, gender, number, pincode));
    }
}

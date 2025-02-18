ClearFood

Restaurants can serve in multiple areas - (PIN)
At a time, users can order from one restaurant, and the quantity of food can be more than one. {Location}
Users should be able to rate any restaurant with or without comment. Rating of a restaurant is the average rating given by all customers. {Rating}


Functional Requirements
Register Restaurant :  Register_restaurant(resturant_name, list of serviceable pin-codes, food item name, food item price, initial quantity). // 1 item for restaurant
Restaurant owners should be able to increase the quantity of the food item. update_quantity(restaurant name, quantity to Add) 
Users should be able to rate(1(Lowest)-5(Highest)) any restaurant with or without comment. rate_restaurant(restaurant name, rating, comment)
User should be able to get list of all serviceable restaurant, food item name and price in descending order: show_restaurant(rating/price) Based on rating, possibly based on price
A restaurant is serviceable when it delivers to the user's pincode and has a non-zero quantity of food item. 
Place an order from any restaurant with any allowed quantity. place_order(restaurant name, quantity)
Order History of User: For a given user you should be able to fetch order history.


Note:-
We can use in memory DB
Do not create any UI for the application
We can have driver class to simulate all these Operation

Expectation:-
Code Completion : Working Executable Code
Feature Coverage
Design Principles
		






Sample flow

User Registration :
register_user(“Pralove”, “M”, “phoneNumber-1”, “HSR”) 
register_user(“Nitesh”, “M”, “phoneNumber-2”, “BTM”) 
register_user(“Vatsal”, “M”, “phoneNumber-3”, “BTM”)
login_user(“phoneNumber-1”)
Restaurant Registration :
register_restaurant(“Food Court-1”, “BTM/HSR”, “NI Thali”, 100, 5) 
NOTE: we will have 2 delimiters in input : ',' to specify separate fields & '/' to identify different pincodes. 
register_restaurant(“Food Court-2”, “BTM/pincode-2”, “Burger”, 120, 3)
login_user(“phoneNumber-2”) 
register_restaurant(“Food Court-3”, “HSR”, “SI Thali”, 150, 1) 
login_user(“phoneNumber-3”) 
Fetch Restaurant List :
show_restaurant(“Price”)  —-> Output : Food Court-2, Burger | Food Court-1, NI Thali
Place Order :
place_order(“Food Court-1”, 2) —-> Output: Order Placed Successfully.
place_order(““Food Court-2”, 7) —-> Output : Cannot place order


Add Review :
create_review(“Food Court-2”, 3, “Good Food”) 
create_review(“Food Court-1”, 5, “Nice Food”)




show_restaurant(“rating”) —-> 
Output : Food Court-1, NI Thali Food Court-2, Burger


login_user(“phoneNumber-1”) —> update_quantity(“Food Court-2”, 5) 
Output: Food Court-2, BTM, Burger - 8

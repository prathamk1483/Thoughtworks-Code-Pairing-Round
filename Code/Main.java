package Code;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Menu menuRestaurant1 = new Menu();

        menuRestaurant1.addItem("A001",new FoodItem("Fried Rice",220,true));
        menuRestaurant1.addItem("A002",new FoodItem("Hakka Noodle",200,false));
        menuRestaurant1.addItem("A003",new FoodItem("Cold Coffee",100,true));
        menuRestaurant1.addItem("A004",new FoodItem("Fresh Juice",80,false));

        Restaurant restaurantA = new Restaurant(menuRestaurant1,300,50);

        Menu menuRestaurant2 = new Menu();

        menuRestaurant1.addItem("B001",new FoodItem("Pan cakes",200,true));
        menuRestaurant1.addItem("B002",new FoodItem("Chowmein",250,false));
        menuRestaurant1.addItem("B003",new FoodItem("Cold Coffee",80,false));
        menuRestaurant1.addItem("B004",new FoodItem("Hakka Noodle",180,true));

        Restaurant restaurantB = new Restaurant(menuRestaurant2,200,40);

        Scanner sc = new Scanner(System.in);
        String query = sc.nextLine();

        String[] queryArr = query.split(",");
        HandleOrder orderHandler = new HandleOrder();

        orderHandler.orderViaAnyRestaurant(queryArr);

        double answer = restaurant.getBill();

        System.out.println(answer == 0 ? "" : answer);
    }
}

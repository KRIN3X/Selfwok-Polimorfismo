package Es2;

public class App {
    public static void main(String[] args){
        Dish[] dishes = {
            new Dish("Pasta", 8.50),
            new Dish("Pizza", 10.00),
            new Dish("Salad", 6.00)
        };

        Drink[] drinks = {
            new Drink("Water", 1.50),
            new Drink("Soda", 2.00),
            new Drink("Wine", 5.00)
        };

        Restaurant restaurant = new Restaurant("La Trattoria", dishes, drinks);
        restaurant.stampaMenu();
    }
}

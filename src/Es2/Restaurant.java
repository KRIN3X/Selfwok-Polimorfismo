package Es2;

public class Restaurant {
    public String name;
    public Dish[] dishes;
    public Drink[] drinks;
    
    public Restaurant(String name, Dish[] dishes, Drink[] drinks) {
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }

    public void stampaMenu() {
        System.out.println("Menu of " + name + ":");
        System.out.println("Dishes:");
        for (Dish dish : dishes) {
            System.out.println("- " + dish.getName() + " - $" + dish.getPrice());
        }
        System.out.println("Drinks:");
        for (Drink drink : drinks) {
            System.out.println("- " + drink.getName() + " - $" + drink.getPrice());
        }
    }
}

package restaurant.entities;

public class Meal {

    private String type;
    private Hamburguer hamburguer;
    private Drink drink;
    private Dessert dessert;

    public Meal(String type, Hamburguer hamburguer, Drink drink, Dessert dessert) {

        this.type = type;
        this.dessert = dessert;
        this.drink = drink;
        this.hamburguer = hamburguer;

    }

    public void display() {
        System.out.println(type + ": \n\n" + 
        "Drink: " + (drink == null ? "" : drink.display()) + "\n" + 
        "Hamburguer: " + hamburguer.display() + "\n" + 
        "Dessert: " + dessert.display() + "\n");
    }
    
}

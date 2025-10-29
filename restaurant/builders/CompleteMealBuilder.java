package restaurant.builders;

import restaurant.entities.Dessert;
import restaurant.entities.Drink;
import restaurant.entities.Hamburguer;
import restaurant.entities.Meal;

public class CompleteMealBuilder implements Builder{

    private String type;
    private Hamburguer hamburguer;
    private Drink drink;
    private Dessert dessert;
    
    public void setType(String type) { this.type = type; }

    public void setHamburguer(Hamburguer hamburguer) { this.hamburguer = hamburguer; }

    public void setDrink(Drink drink) { this.drink = drink; }

    public void setDessert(Dessert dessert) { this.dessert = dessert; }

    public Meal getResult() { return new Meal(type, hamburguer, drink, dessert); }
}

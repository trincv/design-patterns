package restaurant.director;

import restaurant.builders.Builder;
import restaurant.entities.Dessert;
import restaurant.entities.Drink;
import restaurant.entities.Hamburguer;

public class MealDirector {

    public void buildKidsMeal(Builder builder) {
        builder.setType("Kids");
        builder.setHamburguer(new Hamburguer("Super hot"));
        builder.setDessert(new Dessert("Sorvete"));
    }

    public void buildCompleteMeal(Builder builder) {
        builder.setType("Complete");
        builder.setHamburguer(new Hamburguer("MC lanche"));
        builder.setDessert(new Dessert("Milkshake"));
        builder.setDrink(new Drink("Heineken"));
    }
}

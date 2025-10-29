package restaurant.builders;

import restaurant.entities.Dessert;
import restaurant.entities.Drink;
import restaurant.entities.Hamburguer;

public interface Builder {
    public abstract void setType(String type);
    public abstract void setHamburguer(Hamburguer hamburguer);
    public abstract void setDrink(Drink drink);
    public abstract void setDessert(Dessert dessert);
}

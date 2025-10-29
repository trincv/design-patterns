package restaurant;

import restaurant.builders.CompleteMealBuilder;
import restaurant.builders.KidsMealBuilder;
import restaurant.director.MealDirector;
import restaurant.entities.Meal;

public class Main {
    
    public static void main(String[] args) {
        
        MealDirector director = new MealDirector();

        KidsMealBuilder kidsBuilder = new KidsMealBuilder();
        CompleteMealBuilder completeBuilder = new CompleteMealBuilder();

        director.buildKidsMeal(kidsBuilder);
        director.buildCompleteMeal(completeBuilder);

        Meal kidsMeal = kidsBuilder.getResult();
        Meal completeMeal = completeBuilder.getResult();

        kidsMeal.display();
        completeMeal.display();
    }
}

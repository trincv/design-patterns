package coffeshop.condiments;

import coffeshop.beverages.Beverage;

public class Whip extends Beverage {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.description = beverage.getDescription() + ", with whip";
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

     @Override
    public String getDescription() {
        return beverage.getDescription() + ", with whip";
    }
    
    
    @Override
    public double cost() {

        double totalCost = 0.1;

        totalCost += beverage.cost();

        return totalCost;
    }
}

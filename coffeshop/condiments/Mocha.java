package coffeshop.condiments;

import coffeshop.beverages.Beverage;

public class Mocha extends Beverage {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with mocha";
    }
    
    @Override
    public double cost() {
        
        double totalCost = 0.2;

        totalCost += beverage.cost();

        return totalCost;
    }
}

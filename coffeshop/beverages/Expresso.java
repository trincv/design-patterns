package coffeshop.beverages;

public class Expresso extends Beverage {

    public Expresso() {
        this.description = "Expresso";
    }

    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
    
}

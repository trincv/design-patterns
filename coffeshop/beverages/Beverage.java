package coffeshop.beverages;

public abstract class Beverage {
    
    protected String description = "Unknown beverage";

    public abstract String getDescription();

    public abstract double cost(); 
}

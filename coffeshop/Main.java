package coffeshop;

import coffeshop.beverages.Beverage;
import coffeshop.beverages.Expresso;
import coffeshop.condiments.Mocha;
import coffeshop.condiments.Whip;

public class Main {

    public static void main(String[] args) {
        
        Beverage expressMochaWhip = new Whip(new Mocha(new Expresso()));

        System.out.println(expressMochaWhip.getDescription() + " costs " + expressMochaWhip.cost());
    }
}

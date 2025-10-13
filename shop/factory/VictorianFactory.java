package shop.factory;

import shop.furniture.chair.Chair;
import shop.furniture.chair.VictorianChair;
import shop.furniture.sofa.Sofa;
import shop.furniture.sofa.VictorianSofa;

public class VictorianFactory extends FurnitureFactory{
    
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

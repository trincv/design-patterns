package shop.factory;

import shop.furniture.chair.Chair;
import shop.furniture.chair.IndustrialChair;
import shop.furniture.sofa.IndustrialSofa;
import shop.furniture.sofa.Sofa;

public class IndustrialFactory extends FurnitureFactory {

    @Override
    public Chair createChair() {
        return new IndustrialChair();
    }

    @Override
    public Sofa createSofa() {
        return new IndustrialSofa();
    }
    
}

package shop.factory;

import shop.furniture.chair.Chair;
import shop.furniture.chair.ModernChair;
import shop.furniture.sofa.ModernSofa;
import shop.furniture.sofa.Sofa;

public class ModernFactory extends FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
    
}

package shop.factory;

import shop.furniture.chair.Chair;
import shop.furniture.sofa.Sofa;

public abstract class FurnitureFactory {
    
    public abstract Chair createChair();
    
    public abstract Sofa createSofa();

}

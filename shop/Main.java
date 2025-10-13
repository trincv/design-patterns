package shop;

import shop.factory.FurnitureFactory;
import shop.factory.ModernFactory;
import shop.furniture.chair.Chair;
import shop.furniture.sofa.Sofa;

public class Main {
    FurnitureFactory factory = new ModernFactory();

    Chair c = factory.createChair();
    Sofa s = factory.createSofa();

    c.sit();
    s.layDown();

}

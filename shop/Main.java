package shop;

import shop.factory.FurnitureFactory;
import shop.factory.VictorianFactory;
import shop.furniture.chair.Chair;
import shop.furniture.sofa.Sofa;

public class Main {

    public static void main(String[] args) {
        FurnitureFactory factory = new VictorianFactory();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        
        chair.sit();
        sofa.layDown();
    }

}

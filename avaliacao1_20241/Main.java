package avaliacao1_20241;

import avaliacao1_20241.factory.CrusadeStarterFactory;
import avaliacao1_20241.personagem.Caracter;

public class Main {

    public static void main(String[] args) {
        CrusadeStarterFactory cruzadeFactory = new CrusadeStarterFactory();
        Caracter cruzade = cruzadeFactory.createStarterCharacter();

        cruzade.display();
    }


}

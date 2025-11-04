package avaliacao1_20231;

import avaliacao1_20231.alimento.Alimento;
import avaliacao1_20231.nutriente.ArmazenNutrientes;
import avaliacao1_20231.nutriente.Nutriente;
import avaliacao1_20231.preparo.Preparo;
import avaliacao1_20231.preparo.PreparoBuilder;

public class Main {

    public static void main(String[] args) {

        ArmazenNutrientes armazen = new ArmazenNutrientes(); 

        try {

            Nutriente a = armazen.create("proteína", "mg", 20d);
            Nutriente b = armazen.create("carboidrato", "L", 30d);
            Nutriente c = armazen.create("proteína", "L", 50d);
            Nutriente d = armazen.create("carboidrato");

            System.out.println("Nutriente a: " + a.getNome() + "," + a.getUnidade() + "," + a.getCaloriaPorUnidade());
            System.out.println("Nutriente b: " + b.getNome() + "," + b.getUnidade() + "," + b.getCaloriaPorUnidade());
            System.out.println("Nutriente c: " + c.getNome() + "," + c.getUnidade() + "," + c.getCaloriaPorUnidade());
            System.out.println("Nutriente d: " + d.getNome() + "," + d.getUnidade() + "," + d.getCaloriaPorUnidade());

        } catch(Exception e) {
            System.out.println("Exception detected");
        }


        Preparo preparo = new PreparoBuilder().init()
                                                     .setLowCarb(true)
                                                     .setGluten(true)
                                                     .addAlimentos(new Alimento("UNIDADE DE PVO", 1.0))
                                                     .addAlimentos(new Alimento("GRAMAS de SAL", 2.0))
                                                     .addAlimentos(new Alimento("OLHER DE CHÁ de MANTEIGA. ", 1.0))
                                                     .build("OVO FRITO");

        preparo.display();
    }


}

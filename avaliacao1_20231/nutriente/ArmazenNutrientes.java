package avaliacao1_20231.nutriente;

public class ArmazenNutrientes {
    

    public Nutriente create(String nome, String unidade, Double caloriaPorUnidade) {

        return Nutriente.getInstance(nome, unidade, caloriaPorUnidade);

    }

    public Nutriente create(String nome) throws Exception {

        return Nutriente.getInstance(nome);
        
    }
}

package avaliacao1_20231.nutriente;

import java.util.HashMap;

public class Nutriente {

    private String nome;
    private String unidade;
    private Double caloriaPorUnidade;
    private static HashMap<String, Nutriente> instance = new HashMap<>();

    public Nutriente(String nome, String unidade, Double caloriaPorUnidade) {
        this.nome = nome;
        this.caloriaPorUnidade = caloriaPorUnidade;
        this.unidade = unidade;
    }

    public static Nutriente getInstance(String nome, String unidade, Double caloriaPorUnidade) {

        Nutriente nutriente = instance.get(nome);

        if(nutriente == null) {
            instance.put(nome, new Nutriente(nome, unidade, caloriaPorUnidade));
            return instance.get(nome);
        }

        nutriente.setUnidade(unidade);
        nutriente.setCaloriaPorUnidade(caloriaPorUnidade);
        instance.put(nome, nutriente);

        return nutriente;
    }

    public static Nutriente getInstance(String nome) {

        Nutriente nutriente = instance.get(nome);

        if(nutriente == null) {
            return null;
        }

        return nutriente;
    }

    public void setUnidade(String unidade) { this.unidade = unidade; }
    public void setCaloriaPorUnidade(Double caloriaPorUnidade) { this.caloriaPorUnidade = caloriaPorUnidade; }

    public String getNome() {
        return this.nome;
    }

    public String getUnidade() {
        return this.unidade;
    }

    public Double getCaloriaPorUnidade() {
        return this.caloriaPorUnidade;
    }

}

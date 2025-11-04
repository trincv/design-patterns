package avaliacao1_20231.alimento;

public class Alimento {

    private String nome;
    private Double qtdAlimento;


    public Alimento(String nome, Double qtdAlimento) {
        this.nome = nome;
        this.qtdAlimento = qtdAlimento;
    }

    public Double getQtdAlimento() { return this.qtdAlimento; }

    @Override
    public String toString() {
        return nome;
    } 
}

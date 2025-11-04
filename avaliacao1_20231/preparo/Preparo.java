package avaliacao1_20231.preparo;

import java.util.ArrayList;

import avaliacao1_20231.alimento.Alimento;

public class Preparo {

    private String nome;
    private boolean lowCarb; 
    private boolean vegano;
    private boolean semGluten;
    private boolean semLactose; 
    private boolean reduzidoSodio;
    private ArrayList<Alimento> listAlimentos = new ArrayList<>();

    public Preparo(String nome, boolean lowCarb, boolean vegano, boolean semGluten, 
                   boolean semLactose, boolean reduzidoSodio, ArrayList<Alimento> listAlimentos) 
    {
        this.semGluten = semGluten;
        this.semLactose = semLactose;
        this.listAlimentos = listAlimentos;
        this.lowCarb = lowCarb;
        this.nome = nome;
        this.reduzidoSodio = reduzidoSodio;
        this.vegano = vegano;
    }

    public void display() {
        System.out.println("Preparo: " + nome);
        System.out.println("ingrdientes: " + listAlimentos);
        System.out.println("sem lactose: " + semLactose);
        System.out.println("low carb: " + lowCarb);
    }

}

package avaliacao1_20231.preparo;

import java.util.ArrayList;

import avaliacao1_20231.alimento.Alimento;

public class PreparoBuilder {

    private boolean lowCarb; 
    private boolean vegano;
    private boolean semGluten;
    private boolean semLactose; 
    private boolean reduzidoSodio;
    private ArrayList<Alimento> listAlimentos = new ArrayList<>();

    public PreparoBuilder init() {
        this.semGluten = false;
        this.semLactose = false;
        this.lowCarb = false;
        this.vegano = false;
        this.reduzidoSodio = false;

        return this;
    }

    public PreparoBuilder setLowCarb(boolean lowCarb) { 
        this.lowCarb = lowCarb; 
        return this;
    }
    public PreparoBuilder setVegano(boolean vegano) { 
        this.vegano = vegano;  
        return this;
    }
    public PreparoBuilder setGluten(boolean semGluten) { 
        this.semGluten = semGluten; 
        return this;
    }
    public PreparoBuilder setLactose(boolean semLactose) { 
        this.semLactose = semLactose;  
        return this;
    }
    public PreparoBuilder setReduzidoSodio(boolean reduzidoSodio) { 
        this.reduzidoSodio = reduzidoSodio;  
        return this;
    }
    public PreparoBuilder addAlimentos(Alimento alimento) { 
        this.listAlimentos.add(alimento);
        return this;
    }
    
    public Preparo build(String nome) {
        return new Preparo(nome, lowCarb, vegano, semGluten, semLactose, reduzidoSodio, listAlimentos);
    }
}

package avaliacao1_20241.armas;

public abstract class Weapon {

    private String type;
    private double adicionalForca;
    private double adicionalRapido;
    private double adicionalHabilidade;
    private boolean habilitada;

    public Weapon(WeaponBuilder builder) {
        this.adicionalForca = builder.adicionalForca;
        this.adicionalHabilidade = builder.adicionalHabilidade;
        this.adicionalRapido = builder.adicionalRapido;
        this.habilitada = builder.habilitada;
        this.type = builder.type;
    }

    public double getAdicionalRapido() { return this.adicionalRapido; }
    public double getAdicionalForca() { return this.adicionalForca; }
    public double getAdicionalHabilidade() { return this.adicionalHabilidade; }
    public boolean getHabilitada() { return this.habilitada; }

    @Override
    public String toString() {
        return this.type;
    }


    public static abstract class WeaponBuilder {
        
        private String type;
        private double adicionalForca;
        private double adicionalRapido;
        private double adicionalHabilidade;
        private boolean habilitada;

        public WeaponBuilder setAdicionalForca(double adicionalForca) { 
            this.adicionalForca = adicionalForca; 
            return this;
        }

        public WeaponBuilder setAdicionalRapido(double adicionalRapido) { 
            this.adicionalRapido = adicionalRapido; 
            return this;
        }

        public WeaponBuilder setAdicionalHabilidade(double adicionalHabilidade) { 
            this.adicionalHabilidade = adicionalHabilidade; 
            return this;
        }

        public WeaponBuilder setHabilitada(boolean habilitada) { 
            this.habilitada = habilitada; 
            return this;
        }

        public WeaponBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public abstract Weapon build();

    }
}

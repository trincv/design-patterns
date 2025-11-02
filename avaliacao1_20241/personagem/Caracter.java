package avaliacao1_20241.personagem;

import java.util.ArrayList;
import avaliacao1_20241.armas.Weapon;

public abstract class Caracter {

    private double ataqueRapido;
    private double ataqueForca;
    private double ataqueHabilidade;
    private double defesa;
    private ArrayList<Weapon> weapons = new ArrayList<>();

    public Caracter(Caracter.CaracterBuilder builder) {
        this.ataqueForca = builder.ataqueForca;
        this.ataqueHabilidade = builder.ataqueHabilidade;
        this.ataqueRapido = builder.ataqueRapido;
        this.defesa = builder.defesa;
        this.weapons = builder.weapons;
    }

    public double getAtaqueRapido() { return this.ataqueRapido; }
    public double getAtaqueForca() { return this.ataqueForca; }
    public double getAtaqueHabilidade() {return this.ataqueHabilidade; }
    public double getDefesa() {return this.defesa; }
    public ArrayList<Weapon> getWeaponList() { return this.weapons; }

    public void display() {
        System.out.println("Type: " + this.getClass().toString());
        System.out.println("ataque rapido: " + ataqueRapido);
        System.out.println("ataque força: " + ataqueForca);
        System.out.println("ataque habilidade: " + ataqueHabilidade);
        System.out.println("defesa: " + defesa);
        System.out.println("armas: " + weapons);
    }

    public static abstract class CaracterBuilder {

        private double ataqueRapido;
        private double ataqueForca;
        private double ataqueHabilidade;
        private double defesa;
        private ArrayList<Weapon> weapons = new ArrayList<>();

        public void setAtaqueRapido(double ataqueRapido) { this.ataqueRapido = ataqueRapido; }
        public void setAtaqueForca(double ataqueForca) { this.ataqueForca = ataqueForca; }
        public void setAtaqueHabilidade(double ataqueHabilidade) { this.ataqueHabilidade = ataqueHabilidade; }
        public void setDefesa(double defesa) { this.defesa = defesa; }
        public void setWeapon(Weapon weapon) { this.weapons.add(weapon); }

        public abstract Caracter build();
    }
}

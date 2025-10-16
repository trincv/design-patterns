package game;

import game.character.Warrior;
import game.weapons.Weapon;

public class Main {
    
    public static void main(String[] args) {
        

        Warrior wa1 = new Warrior("Hella", new Weapon("axe"));
        Warrior wa2 = (Warrior) wa1.clone();

        wa1.display();

        wa2.setWeapon(new Weapon("Sword"));
        
        wa2.display();

    }
}

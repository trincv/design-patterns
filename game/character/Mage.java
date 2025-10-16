package game.character;

import game.weapons.Weapon;

public class Mage extends GameCharacter {
    
    public Mage(String name, Weapon weapon) {
        super(name, weapon);
    }

    public Mage(GameCharacter target) { super(target); }

    @Override
    public GameCharacter clone() {
        return new Mage(this);
    }
}

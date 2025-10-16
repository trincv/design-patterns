package game.character;

import game.weapons.Weapon;

public class Warrior extends GameCharacter {
    
    public Warrior(String name, Weapon weapon) {
        super(name, weapon);
    }

    public Warrior(GameCharacter target) { super(target); }

    @Override
    public GameCharacter clone() {
        return new Warrior(this);
    }
}

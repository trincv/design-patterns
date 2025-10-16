package game.character;

import game.weapons.Weapon;

public abstract class GameCharacter {

    private String name;
    private Weapon weapon;

    public GameCharacter(GameCharacter target) {
        this.name = target.getName();
        this.weapon = new Weapon(target.getWeapon().getType());
    }

    public GameCharacter(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public abstract GameCharacter clone();

    public void display() {
        System.out.println("Name: " + name + "\n" + "Weapon: " + weapon.getType());
    }

    public String getName() { return this.name; } 
    public Weapon getWeapon() { return this.weapon; }
    public void setWeapon(Weapon newWeapon) { this.weapon = newWeapon; } // somente para teste de deepcopy
}

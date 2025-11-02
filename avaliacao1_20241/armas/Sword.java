package avaliacao1_20241.armas;

public class Sword extends Weapon {
    
    public Sword(Sword.SwordBuilder builder) {
        super(builder);
    }

    public static class SwordBuilder extends WeaponBuilder {
        @Override
        public Weapon build() { return new Sword(this); }
    }
}

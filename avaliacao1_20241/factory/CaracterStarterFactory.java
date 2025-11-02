package avaliacao1_20241.factory;

import avaliacao1_20241.armas.Weapon;
import avaliacao1_20241.personagem.Caracter;

public abstract class CaracterStarterFactory {
    
    public abstract Caracter createStarterCharacter();

    protected abstract void configureDefault(Caracter.CaracterBuilder builder);

    protected abstract Weapon createWeapon();

}

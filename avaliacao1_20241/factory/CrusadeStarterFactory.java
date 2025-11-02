package avaliacao1_20241.factory;

import avaliacao1_20241.armas.Sword;
import avaliacao1_20241.armas.Weapon;
import avaliacao1_20241.personagem.Caracter;
import avaliacao1_20241.personagem.Caracter.CaracterBuilder;
import avaliacao1_20241.personagem.Crusader.CrusaderBuilder;

public class CrusadeStarterFactory extends CaracterStarterFactory {
    
    @Override
    public Caracter createStarterCharacter() {
        CrusaderBuilder builder = new CrusaderBuilder();
        configureDefault(builder);
        
        Weapon weapon = createWeapon();
        builder.setWeapon(weapon);

        return builder.build();
    }

    @Override
    protected void configureDefault(CaracterBuilder builder) {
        builder.setAtaqueForca(50);
        builder.setAtaqueRapido(10);
        builder.setAtaqueHabilidade(100);
        builder.setDefesa(150);
    }

    @Override
    protected Weapon createWeapon() {
        return new Sword.SwordBuilder()
                        .setType("Sword")
                        .setAdicionalForca(20)
                        .setAdicionalRapido(10)
                        .setAdicionalHabilidade(30)
                        .setHabilitada(true)
                        .build();

    }
}

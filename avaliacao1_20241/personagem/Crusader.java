package avaliacao1_20241.personagem;

public class Crusader extends Caracter {

    public Crusader(Crusader.CrusaderBuilder builder) {
        super(builder);
    }

    public static class CrusaderBuilder extends CaracterBuilder{

        @Override
        public Crusader build() { return new Crusader(this); }

    }
}

package mymoves.arbok;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Coil extends PhysicalMove {

    public Coil() {
        super(Type.POISON, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 1);
        pokemon.setMod(Stat.DEFENSE, 1);
        pokemon.setMod(Stat.ACCURACY, 1);
    }

    @Override
    protected String describe() {
        return "использует Coil to raise its Attack, Defense, and Accuracy!";
    }
}

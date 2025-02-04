package mymoves.magearna;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PsychoCut extends PhysicalMove {

    public PsychoCut(int par, int par1) {
        super(Type.PSYCHIC, 70, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        // Increased critical hit ratio: 1/8 instead of the default 1/24
        return Math.random() < 1.0 / 8 ? 2.0 : 1.0;
    }

    @Override
    protected String describe() {
        return "использует Psycho Cut";
    }
}

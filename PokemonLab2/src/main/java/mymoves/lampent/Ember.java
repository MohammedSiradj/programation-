package mymoves.lampent;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
public class Ember extends SpecialMove {
    public Ember(double pow, double acc) {
        super(Type.FIRE, 40, 100);
    }
    @Override
    
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect.burn(p);
            System.out.println("Burned " + p.toString() + " with Ember");
        }
    }
}
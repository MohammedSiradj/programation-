package mymoves.arbok;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SludgeBomb extends SpecialMove {

    public SludgeBomb(int par, int par1) {
        // Sludge Bomb: Special move, Power 90, Accuracy 100%
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        // 30% chance to poison the target
        if (Math.random() <= 0.3) {
            // Apply poison only if the target is not immune
            if (!p.hasType(Type.POISON) && !p.hasType(Type.STEEL) ){
                Effect.poison(p); // Poison the target
            }
        }
    }

    @Override
    protected String describe() {
        return "использует Sludge Bomb";
    }
}

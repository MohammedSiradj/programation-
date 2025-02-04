package mymoves.arbok;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class IceFang extends PhysicalMove {

    public IceFang(int i, int j) {
        super(Type.ICE, 65, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            if (!p.hasType(Type.ICE)) {
                Effect.freeze(p);
                System.out.println("Froze " + p.toString() + " with Ice Fang");
            }
        }
    }

    @Override
    protected String describe() {
        return "использует Ice Fang";
    }
}

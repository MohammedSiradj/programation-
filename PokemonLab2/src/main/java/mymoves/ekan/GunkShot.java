package mymoves.ekan;



import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class GunkShot extends PhysicalMove {

    public GunkShot(int par, int par1) {
        super(Type.POISON, 120, 80);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
        Effect.poison(p);
                System.out.println("Poisoned " + p.toString() + " with GunkShot");
        }
    }
}


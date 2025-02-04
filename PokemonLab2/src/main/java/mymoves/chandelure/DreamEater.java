package mymoves.chandelure;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {

    public DreamEater(int par, int par1) {
        super(Type.PSYCHIC, 100, 100);
    }

    protected void applyOppEffects(Pokemon p, double damage) {

            Pokemon chandelurPokemon = p;

            if (chandelurPokemon.getStat(Stat.SPECIAL_ATTACK) > chandelurPokemon.getStat(Stat.SPECIAL_DEFENSE)) {
                Effect.sleep(p);
                System.out.println("Woke up " + p.toString() + " with Dream Eater");
            }
        }

    }

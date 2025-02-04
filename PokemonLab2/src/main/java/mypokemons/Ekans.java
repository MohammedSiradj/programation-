package mypokemons;

import mymoves.ekan.Coil;
import mymoves.ekan.GunkShot;
import mymoves.ekan.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Ekans extends Pokemon {

    public Ekans(String name, int level) {
        super(name, level);
        super.setType(Type.POISON);
        super.setStats(35, 60, 44, 40, 54, 55);
        Coil coil = new Coil();
        super.addMove(coil);
        GunkShot gunkShot = new GunkShot(120, 80);
        super.addMove(gunkShot);
        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);
        super.addMove(sludgeBomb);
    }
}

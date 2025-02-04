package mypokemons;

import mymoves.arbok.Coil;
import mymoves.arbok.GunkShot;
import mymoves.arbok.IceFang;
import mymoves.arbok.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Arbok extends Pokemon {

    public Arbok(String name, int level) {
        super(name, level);
        
        super.setType(Type.POISON);
        super.setStats(60, 95, 69, 65, 79, 80);
        GunkShot gunkShot = new GunkShot(120, 96);
        super.addMove(gunkShot);
        Coil coil = new Coil();
        super.addMove(coil);
        IceFang iceFang = new IceFang(65, 95);
        super.addMove(iceFang);
        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);
        super.addMove(sludgeBomb);
    }
}

package mypokemons;


import mymoves.litwick.DreamEater;
import mymoves.litwick.FireBlast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Litwick extends Pokemon {

    public Litwick(String name, int level) {
        super(name, level);
        
        super.setType(Type.FIRE);
        super.setStats(50, 30, 55, 65, 55, 20);
        FireBlast fireBlast = new FireBlast(110, 85);
        super.addMove(fireBlast);
        DreamEater dreamEater = new DreamEater(100, 100);
        super.addMove(dreamEater);

    }
}

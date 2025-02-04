package mypokemons;
import mymoves.lampent.DreamEater;
import mymoves.lampent.Ember;
import mymoves.lampent.FireBlast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Lampent extends Pokemon {

    public Lampent(String name, int level) {
        super(name, level);
        
        super.setType(Type.FIRE);
        super.setStats(60, 40, 60, 95, 60, 70);
        Ember ember = new Ember(40, 100);
        super.addMove(ember);
        FireBlast fireBlast = new FireBlast(110, 85);
        super.addMove(fireBlast);
        DreamEater dreamEater = new DreamEater(100, 100);
        super.addMove(dreamEater);


    }
}

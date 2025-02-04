package mypokemons;


import mymoves.chandelure.DreamEater;
import mymoves.chandelure.Ember;
import mymoves.chandelure.FireBlast;
import mymoves.chandelure.FlameChange;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;



public class Chandelure extends Pokemon {

    public Chandelure(String name, int level) {
        super(name, level);
        
        super.setType(Type.FIRE);
        super.setStats(60, 55, 90, 145, 90, 80);
        DreamEater dreamEater = new DreamEater(100, 100);
        super.setMove(dreamEater);
        Ember ember = new Ember(40, 100);
        super.setMove(ember);
        FireBlast fireBlast = new FireBlast(110, 85);
        super.setMove(fireBlast);
        FlameChange flameChange = new FlameChange(50, 100);
        super.setMove(flameChange);
    }
}

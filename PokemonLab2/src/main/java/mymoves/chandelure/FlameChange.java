package mymoves.chandelure;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
public class FlameChange extends PhysicalMove {
    public FlameChange(int par, int par1) {
        super(Type.FIRE, 50, 100);
    }
    @Override
    protected String describe() {
        return "использует Flame Change";
    }

}

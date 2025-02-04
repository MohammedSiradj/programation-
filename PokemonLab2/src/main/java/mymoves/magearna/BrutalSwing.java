package mymoves.magearna;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
public class BrutalSwing extends PhysicalMove {
    public BrutalSwing(int par, int par1) {
        super(Type.FIGHTING, 60, 100);
    }
    @Override
    protected String describe() {
        return "использует Brutal Swing";
    }

}

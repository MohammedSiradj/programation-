package mymoves.litwick;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
public class DreamEater extends PhysicalMove {
    public DreamEater(int par, int par1) {
        super(Type.FAIRY, 100, 100);
    }
    @Override
    protected String describe() {
        return "использует Dream Eater";
    }

}

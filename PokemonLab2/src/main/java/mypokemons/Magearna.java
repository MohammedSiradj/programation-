package mypokemons;

import mymoves.magearna.BrutalSwing;
import mymoves.magearna.FlashCannon;
import mymoves.magearna.PsychoCut;
import mymoves.magearna.ShadowClaw;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Magearna extends Pokemon {

    public Magearna(String name, int level) {
        super(name, level);
        
        super.setType(Type.FIRE);
        super.setStats(80, 95, 115, 130, 115, 80);
        BrutalSwing brutalSwing = new BrutalSwing(60, 100);
        super.addMove(brutalSwing);
        FlashCannon flashCannon = new FlashCannon(80, 100);
        super.addMove(flashCannon);
        ShadowClaw shadowClaw = new ShadowClaw(70, 100);
        super.addMove(shadowClaw);
        PsychoCut psychoCut = new PsychoCut(70, 100);
        super.addMove(psychoCut);
    }
}

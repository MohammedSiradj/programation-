package org;
import mypokemons.Arbok;
import mypokemons.Chandelure;
import mypokemons.Ekans;
import mypokemons.Lampent;
import mypokemons.Litwick;
import mypokemons.Magearna;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;



// https://veekun.com/dex/pokemon/arbok
// https://veekun.com/dex/pokemon/ekans
// https://veekun.com/dex/pokemon/litwick
// https://veekun.com/dex/pokemon/lampent
// https://veekun.com/dex/pokemon/chandelure
// https://veekun.com/dex/pokemon/magearna
public class PokemonLab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Arbok("Arbok", 1);
        Pokemon p2 = new Chandelure("Chandelure", 1);
        Pokemon p3 = new Ekans("Ekans", 1);
        Pokemon p4 = new Lampent("Lampent", 1);
        Pokemon p5 = new Litwick("Litwick", 1);
        Pokemon p6 = new Magearna("Magearna", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
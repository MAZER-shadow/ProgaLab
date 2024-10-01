package myPokemons;

import attacksMyPokemons.attacksGlalie.FrostBreath;
import attacksMyPokemons.attacksGlalie.IceBeam;
import attacksMyPokemons.attacksGlalie.PowderSnow;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Snorunt extends Pokemon {
    public Snorunt(String name, int level) {
        super(name, level);
        setType(Type.ICE);
        setStats(50,50,50,50,50,50);
        setMove(new FrostBreath(),new PowderSnow(),new IceBeam());
    }
}

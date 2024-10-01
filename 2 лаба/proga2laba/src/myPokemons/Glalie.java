package myPokemons;
import attacksMyPokemons.attacksGlalie.DarkPulse;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Glalie extends Snorunt {
    public Glalie(String name, int level) {
        super(name, level);
        setStats(80,80,80,80,80,80);
        addMove(new DarkPulse());
    }
}

package PolymorphismMovies;

public class StarWars extends Movie{

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the Universe";
    }
}

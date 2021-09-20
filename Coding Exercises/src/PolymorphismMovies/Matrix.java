package PolymorphismMovies;

public class Matrix extends Movie{

    public Matrix() {
        super("Matrix");
    }

    @Override
    public String plot() {
        return "Nio is the one and he is gonna save humans";
    }
}

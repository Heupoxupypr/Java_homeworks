package Model;

public class ThingService implements ToyService{
    @Override
    public Toy createToy(Toy toy) {
        return toy;
    }
}

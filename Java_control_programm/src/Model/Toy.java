package Model;

public class Toy extends Thing{
    String categoryName;

    public Toy(String name, double weight, String categoryName) {
        super(name, weight);
        this.categoryName = categoryName;
    }

    public Toy(String categoryName) {
        super();
        this.categoryName = categoryName;
    }
    public Toy() {
        this("No_category");
    }
}
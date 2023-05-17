package Model;

public class Toy extends Thing implements ToyCategory, ToyName{
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

    @Override
    public void setCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String getCategory() {
        return this.categoryName;
    }

    @Override
    public String toString(){
        return "Toy (" + super.toString() + ", categoryName = " + this.categoryName + ")";
    }

    @Override
    public String getName() {
        return super.getToyName();
    }
}

package Model;

import java.util.List;

public class CategoryService {
    public Category createFreeCategory() {
        return new Category();
    };
    public Category createCategory(String categoryName, List<Toy> toys) {
        return new Category(categoryName, toys);
    }
    public void addToyToCategory (Category category, Toy toy){
        category.addToyToList(toy);
    }
    public void removeToyFromCategory(Category category, Toy toy){
        category.removeToyFromList(toy);
    }
}

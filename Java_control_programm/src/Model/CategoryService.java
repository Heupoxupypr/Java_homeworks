package Model;

import java.util.List;

public class CategoryService {
    public Category createFreeCategory() {
        return new Category();
    };
    public Category createCategory(String categoryName, List<Toy> toys) {
        return new Category(categoryName, toys);
    }
}

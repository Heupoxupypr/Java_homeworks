package View;

import Model.Category;
import Model.Toy;

import java.util.List;

public class View implements ToyView, CategoryView{
    @Override
    public String categoriesView(List<Category> categories) {
        StringBuilder sb = new StringBuilder();
        for (Category s : categories) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toysView(List<Toy> toys) {

        StringBuilder sb = new StringBuilder();
        for (Toy s : toys) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
}

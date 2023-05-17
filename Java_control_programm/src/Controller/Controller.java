package Controller;

import Model.*;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void start() {
        ThingService thingService = new ThingService();
        CategoryService categoryService = new CategoryService();
        int categoryCount = 10;
        int toysCount = 50;
        List<Category> categoryList = new ArrayList<>();
        List<Toy> toyList = new ArrayList<>();
        for (int i = 0; i < toysCount; i++) {
            toyList.add(thingService.createToy(new Toy()));
        }

        View view = new View();
        System.out.println(view.toysView(toyList));
    }
}

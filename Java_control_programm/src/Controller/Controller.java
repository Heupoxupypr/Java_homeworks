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

        for (int i = 0; i < categoryCount; i++) {
            categoryList.add(categoryService.createFreeCategory());
        }
        System.out.println(view.categoriesView(categoryList));
        for (int i = 0; i < toyList.size(); i++) {
            if (toyList.get(i).getCategory().equals("No_category")){
                for(int j = 0; j < categoryList.size(); j++){
                    if (categoryList.get(j).getCategoryName().toLowerCase().contains(
                            toyList.get(i).getToyName().toLowerCase())){
//                        toyList.get(i).setCategory(categoryList.get(j).getCategoryName());
                        categoryList.get(j).addToyToList(toyList.get(i));
                        break;
                    }
                }
            }
        }
        System.out.println(view.toysView(toyList));
        System.out.println(view.categoriesView(categoryList));
    }
}

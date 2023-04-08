package org.example.Controller;

import org.example.Model.*;
import org.example.View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void start() {
        UserService userService = new UserService();
        List<User> users = new ArrayList<>();
        users.add(new Student());
        users.add(new Teacher());
        userService.read(users);
        View view = new View();
        System.out.println(view.studentView(users));
    }
}
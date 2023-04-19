package org.example.Controller;

import org.example.Model.*;
import org.example.View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void start() {
        UserService userService = new UserService();
        GroupService groupService = new GroupService();
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Group> groups = new ArrayList<>();
        int studentsCount = 20;
        int teachersCount = 5;
        View view = new View();
        for (int i = 0; i < studentsCount; i++){
            students.add(userService.create(new Student()));
        }
        for (int i = 0; i < teachersCount; i++){
            teachers.add(userService.create(new Teacher()));
        }
//        List<User> users = new ArrayList<>();
//        users.add(new Student());
//        users.add(new Teacher());
//        userService.read(users);

        System.out.println(view.studentView(students));
        System.out.println(view.teacherView(teachers));

        groups.add(groupService.createFreeGroup());
        groups.add(groupService.createGroup(teachers.get(0),students));

        System.out.println(view.groupsView(groups));
        System.out.println(view.studentView(students));
        System.out.println(view.teacherView(teachers));

    }
}
package org.example.Model;

import java.util.List;

public class UserService implements DataService{

    @Override
    public Student create(Student student) {
        return student;
    }

    @Override
    public Teacher create(Teacher teacher) {
        return teacher;
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
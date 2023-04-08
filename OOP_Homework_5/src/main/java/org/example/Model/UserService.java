package org.example.Model;

import java.util.List;

public class UserService implements DataService{

    @Override
    public User create(Student student) {
        return new Student();
    }

    @Override
    public User create(Teacher teacher) {
        return new Teacher();
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
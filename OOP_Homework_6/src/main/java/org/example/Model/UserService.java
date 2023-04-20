package org.example.Model;

import java.util.List;
//Добавлен принцип разделения интерфейсов
public class UserService implements StudentService, TeacherService{
    @Override
    public Student createStudent(Student student) {
        return student;
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacher;
    }
}
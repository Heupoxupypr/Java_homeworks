package org.example.View;

import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Teacher;
import org.jetbrains.annotations.NotNull;

import java.util.List;

//Применен принцип разделения интерфейсов и принцип открытости-закрытости
public class View implements StudentView, TeacherView, GroupView{
    @Override
    public String studentView(List<Student> students) {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
    @Override
    public String teacherView(List<Teacher> teachers) {
        StringBuilder sb = new StringBuilder();
        for (Teacher s : teachers) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String groupsView(List<Group> groups) {
        StringBuilder sb = new StringBuilder();
        for (Group s : groups) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
}
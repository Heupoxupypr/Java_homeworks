package org.example.View;

import org.example.Model.Group;
import org.example.Model.Student;
import org.example.Model.Teacher;

import java.util.List;

public class View {
    public String studentView(List<Student> students) {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
    public String teacherView(List<Teacher> teachers) {
        StringBuilder sb = new StringBuilder();
        for (Teacher s : teachers) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }

    public String groupsView(List<Group> groups) {
        StringBuilder sb = new StringBuilder();
        for (Group s : groups) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
}
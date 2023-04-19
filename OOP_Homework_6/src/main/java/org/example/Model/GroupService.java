package org.example.Model;

import java.util.List;

public class GroupService {
    public Group createFreeGroup() {
        return new Group();
    }
    public Group createGroup(Teacher teacher, List<Student> students) {
        return new Group(teacher,students);
    }
    public void addStudent (Group group, Student student){
        group.addStudent(student);
    }
    public void addTeacher (Group group, Teacher teacher){
        group.setTeacher(teacher);
    }

}

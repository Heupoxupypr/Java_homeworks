package org.example.Model;

public class GroupService {
    public Group create(Group group) {
        return new Group();
    }
    public void addStudent (Group group, Student student){
        group.group.add(student);
    }
    public void addTeacher (Group group, Teacher teacher){
        group.teacher = teacher;
    }
}

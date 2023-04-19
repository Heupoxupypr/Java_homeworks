package org.example.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Group {
    private int number;
    private Teacher teacher;
    private List<Student> group;
    protected static Random rnd;

    static {
        rnd = new Random();
    }

    public Group(Teacher teacher, List<Student> group) {
        this();
        this.teacher = teacher;
        this.group.addAll(group);
        this.setNumber(this.number);
    }

    public Group(int number) {
        this.number = number;
        this.teacher = null;
        this.group = new ArrayList<>();
    }


    public Group() {
        this(rnd.nextInt(100,1000));
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        if (!this.group.isEmpty()){
            for (int i = 0; i < this.group.size(); i++){
                this.group.get(i).setGroupId(this.number);
            }
        }
        if (this.teacher != null){
            this.teacher.setGroups(this.number);
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        this.teacher.setGroups(this.number);
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group.addAll(group);
        for (int i = 0; i < this.group.size(); i++){
            this.group.get(i).setGroupId(this.number);
        }
    }
    public void addStudent(Student student) {
        student.setGroupId(this.number);
        this.group.add(student);
    }

    @Override
    public String toString() {
        return "Group {" +
                "number=" + this.number +
                ", teacher=" + this.teacher +
                ", group=" + this.group.size() +
                " students}";
    }
}

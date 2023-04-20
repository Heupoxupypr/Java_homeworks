package org.example.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//По принципу единственной ответственности данный клас имеет зону ответственности только за учителей
public class Teacher extends User  implements TeacherGroups{
    private int experience;
    private List<Integer> groups;

    private static int defaultIndex;

    static {
        defaultIndex = 1;
    }

    public Teacher(LocalDate dateBirth, String fio, int id) {
        super(dateBirth, fio, id);
        this.groups = new ArrayList<>();
        defaultIndex++;
    }

    public Teacher() {
        this(LocalDate.now(), String.format("TeacherDefaultName_%d", defaultIndex), defaultIndex);
    }

    @Override
    public String toString() {
        return "Teacher (" + super.toString() +
                ", experience=" + this.experience +
                ", Groups =" + this.groups.toString() +")";
    }

    @Override
    public List<Integer> getGroups() {
        return groups;
    }

    @Override
    public void setGroups(Integer group) {
        this.groups.add(group);
    }
}

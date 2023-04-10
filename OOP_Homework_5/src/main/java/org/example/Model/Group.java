package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    int number;
    Teacher teacher;
    List<Student> group;

    public Group(int number) {
        this.number = number;
        this.teacher = null;
        this.group = new ArrayList<>();
    }


    public Group() {
        this(777);
    }
}

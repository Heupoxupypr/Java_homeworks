package org.example.Model;

import java.time.LocalDate;
import java.util.List;

public class Teacher extends User {
    int experience;
    List<Integer> groups;

    public Teacher(LocalDate dateBirth, String fio, int id) {
        super(dateBirth, fio, id);
    }

    public Teacher() {
        super(LocalDate.now(), "Petrov I.O.", 29);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

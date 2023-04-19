package org.example.Model;

import java.time.LocalDate;

public abstract class User {
    LocalDate dateBirth;
    String fio;
    int id;

    public User(LocalDate dateBirth, String fio, int id) {
        this.dateBirth = dateBirth;
        this.fio = fio;
        this.id = id;
    }

    public User() {
        this.dateBirth = LocalDate.now();
        this.fio = "Ivanov I.O.";
        this.id = 23;
    }

    @Override
    public String toString() {
        return  "dateBirth=" + dateBirth +
                ", fio='" + fio + '\'' +
                ", id=" + id;
    }

    //    LocalDate vacation;
}
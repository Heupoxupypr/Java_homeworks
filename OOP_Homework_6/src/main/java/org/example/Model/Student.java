package org.example.Model;

import java.time.LocalDate;
//По принципу единственной ответственности данный клас имеет зону ответственности только за студентов
public class Student extends User implements StudentId {
    private int groupId;
//    List<Integer> grade;
    private static int defaultIndex;
//    private static ArrayList<String> Names;
//    protected static Random rnd;

    static {
        defaultIndex = 1;
//        Names = new ArrayList<String>();
//        rnd = new Random();
    }

    public Student(LocalDate dateBirth, String fio, int id) {
//        if (fio.isEmpty()
//                || Character.isDigit(fio.charAt(0))
//                || Student.Names.indexOf(fio) != -1) {
//            this.fio = String.format("StudentDefaultName_%d", defaultIndex++);
//        }
//        Student.Names.add(this.fio);
        super(dateBirth, fio, id);
        this.groupId =0;
        defaultIndex++;
    }

    public Student() {
        this(LocalDate.now(), String.format("StudentDefaultName_%d", defaultIndex), defaultIndex);
//        defaultIndex++;
    }

    @Override
    public String toString() {
        return "Student (" + super.toString() + ", groupId=" + this.groupId + ")";
    }
    @Override
    public int getGroupId() {
        return groupId;
    }
    @Override
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
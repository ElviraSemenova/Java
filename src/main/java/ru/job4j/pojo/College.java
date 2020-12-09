package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Семенов Алексей Михайлович");
        student.setGroupNumber("J2020");
        student.setAdmissionDate("01.09.2020");

        System.out.println(student.getFio() + "  группа " + student.getGroupNumber() + " : " + student.getAdmissionDate());
    }
}


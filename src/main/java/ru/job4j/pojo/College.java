package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Джим");
        student.setLastName("Моррисон");
        student.setGroup("The Doors");
        student.setData(LocalDate.of(1965, 9, 2));
        System.out.println(" FullName: " + student.getName() + " " + student.getLastName() + "\n Group: " + student.getGroup() + "\n Date: " + student.getData());
    }
}

package dao;

import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.List;

public class HardCodeStudentDAO implements StudentDAO {
    private static final List<Student> STUDENTS;
    private int cursor = 0;

    static {
        STUDENTS = new ArrayList<>(10);
        STUDENTS.add(Student.createStudent("Valera", new Knowledge(60)));
        STUDENTS.add(Student.createStudent("Galya", new Knowledge(65)));
        STUDENTS.add(Student.createStudent("Petro", new Knowledge(70)));
        STUDENTS.add(Student.createStudent("Ivan", new Knowledge(75)));
        STUDENTS.add(Student.createStudent("Ganna", new Knowledge(80)));
        STUDENTS.add(Student.createStudent("Slava", new Knowledge(85)));
        STUDENTS.add(Student.createStudent("Vova", new Knowledge(90)));
        STUDENTS.add(Student.createStudent("Max", new Knowledge(92)));
        STUDENTS.add(Student.createStudent("Vlad", new Knowledge(94)));
        STUDENTS.add(Student.createStudent("Valik", new Knowledge(96)));
        STUDENTS.add(Student.createStudent("Dima", new Knowledge(98)));
    }

    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(STUDENTS);
    }

    @Override
    public void beforeFirst() {
        cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor < STUDENTS.size();
    }

    @Override
    public Student next() {
        return hasNext() ? STUDENTS.get(cursor++) : null;
    }
}

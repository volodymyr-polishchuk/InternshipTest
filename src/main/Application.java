package main;

import dao.HardCodeStudentDAO;
import dao.StudentDAO;
import institution.University;
import institution.interlink.Internship;
import person.Student;

import java.util.List;

public class Application {
    private static StudentDAO studentDAO = new HardCodeStudentDAO();

    public static void main(String[] args) {
        List<Student> students = studentDAO.getStudents();

        University university = new University("CH.U.I.");
        students.forEach(university::addStudent);

        Internship internship = new Internship("Interlink");
        university.getStudents().forEach(student -> internship.addStudent(student, university));

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudentsNames());
    }
}

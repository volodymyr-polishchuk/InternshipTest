package app.main;

import app.dao.InstitutionDAO;
import app.dao.impl.MemoryInstitutionDAO;
import app.dao.impl.MemoryStudentDAO;
import app.dao.StudentDAO;
import app.institution.University;
import app.institution.interlink.Internship;
import app.person.Student;

import java.util.List;

public class Application {
    private static StudentDAO studentDAO = new MemoryStudentDAO();
    private static InstitutionDAO institutionDAO = new MemoryInstitutionDAO();

    public static void main(String[] args) {
        List<Student> students = studentDAO.getStudents();

        University university = institutionDAO.getByName("CH.U.I.", University.class);
        students.forEach(university::addStudent);

        Internship internship = institutionDAO.getByName("Interlink", Internship.class);
        university.getStudents().forEach(student -> internship.addStudent(student, university));

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudentsNames());
    }
}

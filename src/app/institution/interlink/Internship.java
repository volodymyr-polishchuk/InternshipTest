package app.institution.interlink;

import app.entities.AbstractInstitutionEntity;
import app.institution.University;
import app.person.Student;

public class Internship extends AbstractInstitutionEntity {

    public Internship(String name) {
        super(name);
    }

    public boolean addStudent(Student student, University university) {
        if (student.getKnowledge().getLevel() > university.getAverageStudentKnowledge()) {
            addStudent(student);
            return true;
        }
        return false;
    }
}

package app.entities;

import app.person.Student;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractInstitutionEntity extends AbstractNamedEntity {
    protected List<Student> students = new ArrayList<>();

    public AbstractInstitutionEntity(String name) {
        super(name);
    }

    protected void addStudent(Student student) {
        students.add(student);
    }

    protected void setStudents(List<Student> students) {
        this.students = new ArrayList<>(students);
    }

    public int getStudentCount() {
        return students.size();
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public String getStudentsNames() {
        final StringBuilder builder = new StringBuilder(students.size() * 15);
        students.forEach(student -> {
            builder.append(student.toString()).append('\n');
        });
        return builder.toString();
    }

}

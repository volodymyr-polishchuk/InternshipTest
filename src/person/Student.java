package person;

import entities.AbstractNamedEntity;
import person.consciousness.Knowledge;

public class Student extends AbstractNamedEntity {
    private Knowledge knowledge;

    public Student(String name) {
        super(name);
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public static Student createStudent(String name, Knowledge knowledge) {
        Student student = new Student(name);
        student.setKnowledge(knowledge);
        return student;
    }

    @Override
    public String toString() {
        return getName();
    }
}

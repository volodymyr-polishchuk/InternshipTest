package institution;

import entities.AbstractInstitutionEntity;
import person.Student;

public class University extends AbstractInstitutionEntity {
    private double averageBuffer = 0;
    private boolean averageBufferActuality = true;

    public University(String name) {
        super(name);
    }

    public double getAverageStudentKnowledge() {
        if (!averageBufferActuality) {
            averageBuffer = students.stream()
                    .mapToDouble(i -> i.getKnowledge().getLevel())
                    .average()
                    .orElse(Double.NaN);
            averageBufferActuality = true;
        }
        return averageBuffer;
    }

    @Override
    public void addStudent(Student student) {
        super.addStudent(student);
        averageBufferActuality = false;
    }

}

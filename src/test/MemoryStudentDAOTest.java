package test;

import app.dao.impl.MemoryStudentDAO;
import app.dao.StudentDAO;
import app.person.Student;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class MemoryStudentDAOTest {

    @Test
    public void count_of_element_when_use_next() {
        StudentDAO studentDAO = new MemoryStudentDAO();
        int size = studentDAO.getStudents().size();

        int count = 0;
        while (studentDAO.hasNext()) {
            studentDAO.next();
            count++;
        }

        assertThat(count, is(size));
    }

    @Test
    public void count_of_element_when_use_next_and_beforeFirst() {
        StudentDAO studentDAO = new MemoryStudentDAO();
        int size = studentDAO.getStudents().size();

        studentDAO.next();
        studentDAO.beforeFirst();

        int count = 0;
        while (studentDAO.hasNext()) {
            studentDAO.next();
            count++;
        }

        assertThat(count, is(size));
    }

    @Test
    public void try_to_change_data_in_list() {
        StudentDAO studentDAO = new MemoryStudentDAO();
        int size = studentDAO.getStudents().size();

        studentDAO.getStudents().add(new Student("Alice"));

        assertThat(studentDAO.getStudents().size(), is(size));
    }
}

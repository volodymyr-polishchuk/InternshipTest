package app.dao;

import app.person.Student;

import java.util.Iterator;
import java.util.List;

public interface StudentDAO extends Iterator<Student> {

    List<Student> getStudents();

    void beforeFirst();

}

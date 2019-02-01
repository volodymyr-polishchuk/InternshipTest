package test;

import app.dao.InstitutionDAO;
import app.dao.impl.MemoryInstitutionDAO;
import app.institution.University;
import app.institution.interlink.Internship;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MemoryInstitutionDAOTest {

    @Test
    public void get_university_from_DAO() {
        InstitutionDAO institutionDAO = new MemoryInstitutionDAO();

        University university = institutionDAO.getByName("CH.U.I.", University.class);

        assertThat(university.getName(), is("CH.U.I."));
    }

    @Test
    public void get_internship_from_DAO() {
        InstitutionDAO institutionDAO = new MemoryInstitutionDAO();

        Internship internship = institutionDAO.getByName("Interlink", Internship.class);

        assertThat(internship.getName(), is("Interlink"));
    }

    @Test
    public void try_change_data_in_DAO() {
        InstitutionDAO institutionDAO = new MemoryInstitutionDAO();
        int size = institutionDAO.getAll().size();

        institutionDAO.getAll().add(new Internship("CH.D.T.U"));

        assertThat(institutionDAO.getAll().size(), is(size));
    }

}

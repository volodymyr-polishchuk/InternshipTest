package app.dao.impl;

import app.dao.InstitutionDAO;
import app.entities.AbstractInstitutionEntity;
import app.institution.University;
import app.institution.interlink.Internship;

import java.util.ArrayList;
import java.util.List;

public class MemoryInstitutionDAO implements InstitutionDAO {

    private static List<AbstractInstitutionEntity> institutions = new ArrayList<>();

    static {
        institutions.add(new University("CH.U.I."));
        institutions.add(new Internship("Interlink"));
    }

    @Override
    public AbstractInstitutionEntity getByName(String name) {
        return institutions.stream()
                .filter((institution) ->  institution.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<AbstractInstitutionEntity> getAll() {
        return new ArrayList<>(institutions);
    }

}

package app.dao;

import app.entities.AbstractInstitutionEntity;

import java.util.List;

public interface InstitutionDAO {

    AbstractInstitutionEntity getByName(String name);

    List<AbstractInstitutionEntity> getAll();

}

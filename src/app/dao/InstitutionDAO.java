package app.dao;

import app.entities.AbstractInstitutionEntity;

import java.util.List;

public interface InstitutionDAO {

    <T extends AbstractInstitutionEntity> T getByName(String name, Class<T> destination);

    List<AbstractInstitutionEntity> getAll();

}

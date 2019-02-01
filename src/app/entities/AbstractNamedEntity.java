package app.entities;

public abstract class AbstractNamedEntity implements NamedEntity {
    private String name;

    public AbstractNamedEntity(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

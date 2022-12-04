package Zoo;

import java.util.Objects;

import static Zoo.ValidateUtils.validateDefault;

public abstract class Birds extends Animals {

    private String typeOfMovement;

    public Birds(String typeOfAnimal, String name, int age, String typeOfMovement, String livingEnvironment) {
        super(typeOfAnimal, name, age, livingEnvironment);
        setTypeOfMovement(typeOfMovement);
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = validateDefault(typeOfMovement);
    }

    public abstract void hunting();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(typeOfMovement, birds.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

}

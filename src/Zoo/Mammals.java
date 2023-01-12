package Zoo;

import java.util.Objects;

import static Zoo.ValidateUtils.validateDefault;

public abstract class Mammals extends Animals {

    private String movementSpeed;
    private String typeFood;

    public Mammals(String typeOfAnimal, String name, int age, String livingEnvironment,String movementSpeed,String typeFood) {
        super(typeOfAnimal, name, age, livingEnvironment);
        setMovementSpeed(movementSpeed);
        setTypeFood(typeFood);
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = validateDefault(typeFood);
    }

    public String getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(String movementSpeed) {
        this.movementSpeed = validateDefault(movementSpeed);
    }

    public abstract void walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Objects.equals(movementSpeed, mammals.movementSpeed) && Objects.equals(typeFood, mammals.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementSpeed, typeFood);
    }

}

package Zoo;

import static Zoo.ValidateUtils.validateDefault;

public abstract class Mammals extends Animals {

    private String movementSpeed;
    private String typeFood;

    public Mammals(String typeOfAnimal, String name, int age, String livingEnvironment,String movementSpeed,String typeFood) {
        super(typeOfAnimal, name, age, livingEnvironment);
        setMovementSpeed(movementSpeed);
        setTypeFood(typeFood);
    }


    public abstract void walk();



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


}

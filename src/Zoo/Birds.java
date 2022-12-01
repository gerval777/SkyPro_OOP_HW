package Zoo;

import static Zoo.ValidateUtils.validateDefault;

public abstract class Birds extends Animals{

    private String typeOfMovement;

    public Birds(String typeOfAnimal, String name, int age, String typeOfMovement, String livingEnvironment) {
        super(typeOfAnimal, name, age, livingEnvironment);
        setTypeOfMovement(typeOfMovement);
    }


    public abstract void hunting();








    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = validateDefault(typeOfMovement);
    }



}

package Zoo;

import java.util.Objects;

import static Zoo.ValidateUtils.validateDefault;
import static Zoo.ValidateUtils.validateNumber;

public abstract class Animals {

    private String typeOfAnimal;
    private String name;
    private int age;
    private String livingEnvironment;

    public Animals(String typeOfAnimal, String name, int age, String livingEnvironment) {
        setName(name);
        setAge(age);
        setLivingEnvironment(livingEnvironment);
        setTypeOfAnimal(typeOfAnimal);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validateDefault(livingEnvironment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = validateDefault(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = validateNumber(age);
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = validateDefault(typeOfAnimal);
    }

    public abstract void eat();
    public abstract void go();
    public abstract void sleep();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(typeOfAnimal, animals.typeOfAnimal) && Objects.equals(name, animals.name) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfAnimal, name, age, livingEnvironment);
    }
}



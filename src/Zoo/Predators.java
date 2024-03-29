package Zoo;

public final class Predators extends Mammals{

    public Predators(String typeOfAnimal, String name, int age, String livingEnvironment, String movementSpeed, String typeFood) {
        super(typeOfAnimal, name, age, livingEnvironment, movementSpeed, typeFood);
    }

    public void hunt() {
        System.out.println("Охится \n");
    }

    @Override
    public String toString() {
        return "Животное: " + getTypeOfAnimal()+ ". Клтичка: " + getName() + ". Возраст: " + getAge() +
                " лет. Среда обитания: " + getLivingEnvironment() + ". Cкорость передвижения: " + getMovementSpeed() +
                ". Пища: " + getTypeFood();
    }

    @Override
    public void eat() {
        System.out.println("Пища: "+getTypeFood());
    }

    @Override
    public void go() {
        System.out.println("Перемещается по земле");
    }

    @Override
    public void sleep() {
        System.out.println("Спит в вальере");
    }
    @Override
    public void walk() {
        System.out.println("Гуляет в клетке");
    }

}

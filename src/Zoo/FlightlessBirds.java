package Zoo;

public final class FlightlessBirds extends Birds {
    public FlightlessBirds(String typeOfAnimal, String name, int age, String typeOfMovement, String livingEnvironment) {
        super(typeOfAnimal, name, age, typeOfMovement, livingEnvironment);
    }

    public void walk() {
        System.out.println("Гуляет");
    }

    @Override
    public String toString() {
        return "Птица: " + getTypeOfAnimal() + ". " + getTypeOfMovement() + ". Клтичка: " + getName() + ". Возраст: " + getAge() +
                " лет. Среда обитания: " + getLivingEnvironment();
    }

    @Override
    public void eat() {
        System.out.println("Не хищник");
    }

    @Override
    public void go() {
        System.out.println("Перемещается по земле");
    }

    @Override
    public void sleep() {
        System.out.println("Спит под открытым небом");
    }

    @Override
    public void hunting() {
        System.out.println("Преобладаяющая часть не летающих птиц питаются зернами, но есть исключения \n");
    }
}

package Zoo;

public final class FlyingBirds extends Birds {

    public FlyingBirds(String typeOfAnimal, String name, int age, String typeOfMovement, String livingEnvironment) {
        super(typeOfAnimal, name, age, typeOfMovement, livingEnvironment);
    }




    public void fly() {
        System.out.println("Летает");
    }


    @Override
    public void eat() {
        System.out.println("Болшая часть летающих птиц питается рыбой, но есть исключения");
    }

    @Override
    public void go() {
        System.out.println("Перемещается по воздуху");
    }

    @Override
    public void sleep() {
        System.out.println("Спит в гнездах");
    }

    @Override
    public void hunting() {
        System.out.println("Охотится на рыбу или мелких грызунов \n");
    }

    @Override
    public String toString() {
        return "Птица: " + getTypeOfAnimal()+ ". "+getTypeOfMovement()+ ". Клтичка: " + getName() + ". Возраст: " + getAge() +
                " лет. Среда обитания: " + getLivingEnvironment();
    }












}

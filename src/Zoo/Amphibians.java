package Zoo;
public final class Amphibians extends Animals {

    public Amphibians(String typeOfAnimal, String name, int age, String livingEnvironment) {
        super(typeOfAnimal, name, age, livingEnvironment);
    }

    public void hunting() {
        System.out.println("Лягушка охотится на насекомых, а уж на лягушек \n");
    }

    @Override
    public String toString() {
        return "Животное: " + getTypeOfAnimal() + ". Клтичка: " + getName() + ". Возраст: " + getAge() +
                " лет. Среда обитания: " + getLivingEnvironment();
    }

    @Override
    public void eat() {
        System.out.println("Лягушка ест насекомых, а уж лягушек");
    }

    @Override
    public void go() {
        System.out.println("Могут передвигаться как по воводе, так и по суше ");
    }

    @Override
    public void sleep() {
        System.out.println("Спят в зараслях");
    }

}
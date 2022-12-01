package Zoo;

public class TestAnimals {
    public static void main(String[] args) {

        Herbivores gazel = new Herbivores ("Газель", "Арфа", 5, "Лес", "Быстрая","Трава");
        System.out.println(gazel);
        gazel.eat();
        gazel.go();
        gazel.sleep();
        gazel.walk();
        gazel.graze();

        Herbivores giraffe = new Herbivores ("Жираф", "Леонард", 9, "Африка", "Медленный","Листья деревьев");
        System.out.println(giraffe);
        giraffe.eat();
        giraffe.go();
        giraffe.sleep();
        giraffe.walk();
        giraffe.graze();

        Herbivores horse = new Herbivores ("Лошадь", "Стрела", 7, "Лес", "Быстрая","трава");
        System.out.println(horse);
        horse.eat();
        horse.go();
        horse.sleep();
        horse.walk();
        horse.graze();

        Predators hyena = new Predators ("Гиена", "Сива", 2, "Зоопарк", "Средняя","мясо");
        System.out.println(hyena);
        hyena.eat();
        hyena.go();
        hyena.sleep();
        hyena.walk();
        hyena.hunt();

        Predators tiger = new Predators ("Тигр", "Семен", 6, "Зоопарк", "Средняя","мясо");
        System.out.println(tiger);
        tiger.eat();
        tiger.go();
        tiger.sleep();
        tiger.walk();
        tiger.hunt();

        Predators bear = new Predators ("Медведь", "Малиныч", 8, "Зоопарк", "Быстрая","мясо");
        System.out.println(bear);
        bear.eat();
        bear.go();
        bear.sleep();
        bear.walk();
        bear.hunt();

        Amphibians frog = new Amphibians ("Лягушка", "crazy", 1, "Болото");
        System.out.println(frog);
        frog.eat();
        frog.go();
        frog.sleep();
        frog.hunting();

        Amphibians grassSnake = new Amphibians ("Уж", "Жора", 1, "Лес");
        System.out.println(grassSnake);
        grassSnake.eat();
        grassSnake.go();
        grassSnake.sleep();
        grassSnake.hunting();

        FlightlessBirds peacock = new FlightlessBirds ("Павлин", "Хвост", 3, "Не летающая","Лес");
        System.out.println(peacock);
        peacock.walk();
        peacock.eat();
        peacock.go();
        peacock.sleep();
        peacock.hunting();

        FlightlessBirds penguin = new FlightlessBirds ("Пингвин", "Кавальски", 8, "Не летающая","Антарктика");
        System.out.println(penguin);
        penguin.walk();
        penguin.eat();
        penguin.go();
        penguin.sleep();
        penguin.hunting();

        FlightlessBirds dodoBird = new FlightlessBirds ("Птица додо", "Додо", 2, "Не летающая","Джунгли");
        System.out.println(dodoBird);
        dodoBird.walk();
        dodoBird.eat();
        dodoBird.go();
        dodoBird.sleep();
        dodoBird.hunting();


        FlyingBirds seagull = new FlyingBirds ("Чайка", "Хади", 1, "Летающая","Болльшая часть планеты");
        System.out.println(seagull);
        seagull.fly();
        seagull.eat();
        seagull.go();
        seagull.sleep();
        seagull.hunting();

        FlyingBirds albatross = new FlyingBirds ("Альбатрос", "Юнга", 2, "летающая","Антарктика");
        System.out.println(albatross);
        albatross.fly();
        albatross.eat();
        albatross.go();
        albatross.sleep();
        albatross.hunting();


        FlyingBirds falcon = new FlyingBirds ("Сокол", "Глаз", 3, "летающая","Почти везде");
        System.out.println(falcon);
        falcon.fly();
        falcon.eat();
        falcon.go();
        falcon.sleep();
        falcon.hunting();






    }
}

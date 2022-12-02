package Homework_1;

public class TestHomewor_1 {
    public static void main(String[] args) {

// OOP_Lesson 1 Домашнее задание 1

        System.out.println("          OOP_Lesson 1      Домашнее задание 1" + "\n");

        Human max = new Human("Максим", "Минск", -1988, "    ");
        max.printGreeting();

        Human ann = new Human("    ", "Москва", 1993, "методист образовательных программ");
        ann.printGreeting();

        Human katya = new Human("Катя", "   ", 1992, "продакт-менеджер");
        katya.printGreeting();

        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        artem.printGreeting();

        Human vladimir = new Human("Владимир", "Казань", 2001, "безработный");
        vladimir.printGreeting();

//   OOP_Lesson 1 Домашнее задание 2
        System.out.println();
        System.out.println("         OOP_Lesson 1      Домашнее задание 2" + "\n");

        Flower rose = new Flower("Роза обыкновенная", "  ", "Голландия", 35.59111, 0);

        System.out.println(rose.toString());

        Flower chrysanthemum = new Flower("Хризантема", "  ", "  ", 15, 5);
        System.out.println(chrysanthemum.toString());

        Flower pion = new Flower("Пион", "  ", "Англия", 69.9, 1);
        System.out.println(pion.toString());

        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.5, 10);
        System.out.println(gypsophila.toString());

        // Дополнительная задача
        System.out.println();
        System.out.println("             Дополнительная задача" + "\n");

        Flower flowerBouquet = new Flower(30, 10, 15, 10);
        System.out.println(flowerBouquet.calculationCostBouquet);
    }
}
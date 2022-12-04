package Transport;

import java.time.LocalDate;

public class TestTransport {
    public static void main(String[] args) {

//   OOP_Lesson 2 Домашнее задание 2
        System.out.println();
        System.out.println("         OOP_Lesson 2      Домашнее задание 2" + "\n");

        Car lada = new Car("Lada", "Granta", 1.6, "", 2019,
                "РФ", "МКПП", "Хэтчбэк", 5, "Лето", "А307  Ну051", "Y");
        System.out.println(lada.toString());

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020,
                "Германия", "МКПП", "     ", 5, "Лето", "А307НУ051", "Y");
        System.out.println(audi.toString());

        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021,
                "Германия", "АКПП", "Лимузин", 6, "Зима", "А307НУ051", "Y");
        System.out.println(bmw.toString());

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018,
                "Южная Корея", "Робот", "Паркетник", 7, "Лето", "А0307НУ051", "Y");
        System.out.println(kia.toString());

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016,
                "Южная Корея", "    ", "      ", 0, "", " ", "Y");
        System.out.println(hyundai.toString());

        Car testCar = new Car("", "  ", 0, " ", 0,
                " ", "    ", "      ", 0, "", " ", "N");
        System.out.println(testCar.toString());

//   OOP_Lesson 2 Домашнее задание 3
        System.out.println();
        System.out.println("         OOP_Lesson 2      Домашнее задание 3" + "\n");

        Car opel = new Car("Opel", "Z8", 3.0, "Черный", 2021,
                "Германия", "АКПП", "Лимузин", 6, "Зима", "А307НУ051", "Y");
        System.out.println(opel.toString());
        Car.Key opelKey = opel.new Key("Есть", "Нет");
        Car.Insurance opelInsurance = opel.new Insurance(LocalDate.of(2021, 2, 2), 200, "32111cs33");
        opel.setKey(opelKey);
        opel.setInsurance(opelInsurance);
        System.out.println(opel);

//   OOP_Lesson 3 Домашнее задание 1
        System.out.println();
        System.out.println("         OOP_Lesson 3      Домашнее задание 1" + "\n");

        Train lastochka = new Train("«Ласточка»", "B-901", 2011, "России", 301,
                "Белорусского","Минск-Пассажирский", 3500, 11);
        System.out.println(lastochka.toString());

        Train leningrad = new Train("«Ленинград»", "D-125", 2019, "России", 270,
                "Ленинградского","Ленинград-Пассажирский", 1700, 8);
        System.out.println(leningrad.toString());

        Train testTrain = new Train("", "", 0, "", 0,
                "","  ", -1700, 0);
        System.out.println(testTrain.toString());
        System.out.println();

        Bus ikarus = new Bus("поддержанный", "Икарус", "К-100", "Российского",
                2010, 34, "Красного", 150, 4_000_000);
        System.out.println(ikarus.toString());

        Bus gaz = new Bus("новый", "ГАЗ", "32700", "Российского",
                2022, 45, "Желтого", 190, 18_000_000);
        System.out.println(gaz.toString());

        Bus testBus = new Bus(" ", " ", " ", " ",
                0, 0, " ", 0, 0);
        System.out.println(testBus.toString());

//   OOP_Lesson 3 Домашнее задание 2
        System.out.println();
        System.out.println("         OOP_Lesson 3      Домашнее задание 2" + "\n");

        Bus gaz1 = new Bus("новый", "ГАЗ", "32700", "Российского",
                2022, 45, "Желтого", 190, 18_000_000);
        System.out.println(gaz1.toString());
        gaz1.refill();

        Train leningrad1 = new Train("«Ленинград»", "D-125", 2019, "России", 270,
                "Ленинградского","Ленинград-Пассажирский", 1700, 8);
        System.out.println(leningrad1.toString());
        leningrad1.refill();

        Car hyundai1 = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016,
                "Южная Корея", "    ", "      ", 0, "", " ", "Y");
        System.out.println(hyundai1.toString());
        hyundai1.refill();
    }

}
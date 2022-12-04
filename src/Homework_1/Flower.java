package Homework_1;

import java.text.DecimalFormat;
import java.util.Objects;

public class Flower {
    private String flowerType;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    //// Дополнительная задача
    private double initialCostBouquet;
    private double finalCostBouquet;
    private double costRose = 35.59;
    private double costChrysanthemum = 15;
    private double costPeon = 69.9;
    private double costGypsophila = 19.5;
    private int lifeSpanBouquet;
    private int lifeSpanRose = 3;
    private int lifeSpanChrysanthemum = 5;
    private int lifeSpanPeon = 1;
    private int lifeGypsophila = 10;
    public String calculationCostBouquet;

    public Flower(String flowerType, String flowerColor, String country, double cost, int lifeSpan) {

        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);

        this.flowerType = flowerType;
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public Flower(int numberRoses, int numberChrysanthemums, int numberPeonies, int numberGypsophiles) {

        if (numberRoses < 0 || numberChrysanthemums < 0 || numberPeonies < 0 || numberGypsophiles < 0) {
            System.out.println("Ошибка в выборе количства цветов. Укажите корректные данные");
        } else {
            initialCostBouquet = (numberRoses * costRose) + (numberChrysanthemums * costChrysanthemum)
                    + (numberPeonies * costPeon) + (numberGypsophiles * costGypsophila);
            finalCostBouquet = initialCostBouquet + (initialCostBouquet * 0.1);
        }

        if (numberPeonies > 0) {
            lifeSpanBouquet = lifeSpanPeon;
        } else if (numberRoses > 0) {
            lifeSpanBouquet = lifeSpanRose;
        } else if (numberChrysanthemums > 0) {
            lifeSpanBouquet = lifeSpanChrysanthemum;
        } else {
            lifeSpanBouquet = lifeGypsophila;
        }

        calculationCostBouquet = "Букет в котором есть: роза обыкновенная — " + numberRoses +
                " шт., хризантема — " + numberChrysanthemums +
                " шт., гипсофила — " + numberGypsophiles +
                " шт., пион — " + numberPeonies +
                " шт., будет стоить " + df.format(finalCostBouquet) + " рублей и простоит " + lifeSpanBouquet + " суток.";
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.trim().isEmpty()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.trim().isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public String getCost() {
        String result = df.format(cost);
        return result;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    private DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public String toString() {
        return "Название цветка: " + flowerType +
                ", цвет: " + getFlowerColor() +
                ", страна происхождения: " + getCountry() +
                ", стоимость: " + getCost() +
                " (срок стояния: " + lifeSpan + " суток).";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.cost, cost) == 0 && lifeSpan == flower.lifeSpan && Double.compare(
                flower.initialCostBouquet, initialCostBouquet) == 0 && Double.compare(flower.finalCostBouquet,
                finalCostBouquet) == 0 && Double.compare(flower.costRose, costRose) == 0 && Double.compare(
                flower.costChrysanthemum, costChrysanthemum) == 0 && Double.compare(flower.costPeon, costPeon)
                == 0 && Double.compare(flower.costGypsophila, costGypsophila) == 0 && lifeSpanBouquet ==
                flower.lifeSpanBouquet && lifeSpanRose == flower.lifeSpanRose && lifeSpanChrysanthemum ==
                flower.lifeSpanChrysanthemum && lifeSpanPeon == flower.lifeSpanPeon && lifeGypsophila ==
                flower.lifeGypsophila && Objects.equals(flowerType, flower.flowerType) && Objects.equals(flowerColor,
                flower.flowerColor) && Objects.equals(country, flower.country) && Objects.equals(calculationCostBouquet,
                flower.calculationCostBouquet) && Objects.equals(df, flower.df);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerType, flowerColor, country, cost, lifeSpan, initialCostBouquet, finalCostBouquet,
                costRose, costChrysanthemum, costPeon, costGypsophila, lifeSpanBouquet, lifeSpanRose, lifeSpanChrysanthemum,
                lifeSpanPeon, lifeGypsophila, calculationCostBouquet, df);
    }
}


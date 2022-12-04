package Transport;

import java.util.Objects;

import static Transport.ValidateUtils.validateDefault;
import static Transport.ValidateUtils.validateNumber;

public final class Bus extends Transport {

    private int numberOfSeats;
    private String busCategory;
    private int salePrice;

    public Bus(String busCategory, String brand, String model, String productionCountry, int productionYear,
               int numberOfSeats, String color, int maxSpeed, int salePrice) {

        super(brand, model, productionYear, productionCountry, maxSpeed, color);
        setBusCategory(busCategory);
        setSalePrice(salePrice);
        setNumberOfSeats(numberOfSeats);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = validateNumber(numberOfSeats);
    }

    public String getBusCategory() {
        return busCategory;
    }

    public void setBusCategory(String busCategory) {
        this.busCategory = validateDefault(busCategory);
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = validateNumber(salePrice);
    }

    @Override
    public void refill() {
        System.out.println("Бензиновый или дизельный двигатель");
    }

    @Override
    public String toString() {
        return "Продается " + getBusCategory() + " автобус, марки " + getBrand() + ", модель:" + getModel() + " от "
                + getProductionCountry() + " производителя. " + getProductionYear() + " года выпуска, количесво мест: "
                + getNumberOfSeats() + ", " + getColor() + " цвета, максимальная скорость: " + getMaxSpeed() + (" км/ч. " +
                "Всего за ") + getSalePrice() + " Рублей.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return numberOfSeats == bus.numberOfSeats && salePrice == bus.salePrice && Objects.equals(busCategory, bus.busCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSeats, busCategory, salePrice);
    }

}

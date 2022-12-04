package Transport;

import java.util.Objects;

import static Transport.ValidateUtils.*;

public final class Train extends Transport {

    private int tripPrice;
    private double tripTime;
    private String departureStationName;
    private String finalStop;
    private int numberOfCars;

    public Train(String brand, String model, int proroductionYear, String productionCountry, int maxSpeed,
                 String departureStationName, String finalStop, int tripPrice, int numberOfCars) {

        super(brand, model, proroductionYear, productionCountry, maxSpeed);
        setTripPrice(tripPrice);
        setDepartureStationName(departureStationName);
        setFinalStop(finalStop);
        setNumberOfCars(numberOfCars);
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = validateNumber(tripPrice);
    }

    public double getTripTime() {
        return tripTime;
    }

    public void setTripTime(double tripTime) {
        this.tripTime = validateTripTime(tripTime);
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = validateDefault(departureStationName);
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = validateDefault(finalStop);
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = validateNumber(numberOfCars);
    }

    public static double validateTripTime(double value) {
        return value <= 0 ? 99.99 : value;
    }

    @Override
    public void refill() {
        System.out.println("Дизельный двигатель");
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + ", " + getProductionYear() + " год выпуска в " + getProductionCountry() + ", скорость передвижения — " + getMaxSpeed() + " км/ч, отходит от "
                + getDepartureStationName() + " вокзала и следует до станции " + getFinalStop() + ". Цена поездки — " + getTripPrice() + " рублей, в поезде " + getNumberOfCars() + " вагонов.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return tripPrice == train.tripPrice && Double.compare(train.tripTime, tripTime) == 0 && numberOfCars == train.numberOfCars && Objects.equals(departureStationName, train.departureStationName) && Objects.equals(finalStop, train.finalStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tripPrice, tripTime, departureStationName, finalStop, numberOfCars);
    }

}

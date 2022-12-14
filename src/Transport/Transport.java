package Transport;

import java.util.Objects;

import static Transport.ValidateUtils.*;

public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private int maxSpeed;
    private double fuelPercentage;

    public Transport(String brand, String model, int productionYear, String productionCountry, int maxSpeed, String color) {
        setBrand(brand);
        setModel(model);
        setProductionCountry(productionCountry);
        setProductionYear(productionYear);
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        setProductionCountry(productionCountry);
        setProductionYear(productionYear);
        setMaxSpeed(maxSpeed);
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
        setBrand(brand);
        setModel(model);
        setProductionCountry(productionCountry);
        setProductionYear(productionYear);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = validateDefault(brand);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = validateDefault(model);
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = validateYear(productionYear);
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = validateDefault(productionCountry);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = validateNumber(maxSpeed);
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public final void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage < 0 || fuelPercentage > 100) {
            this.fuelPercentage = 0;
        } else {
            this.fuelPercentage = fuelPercentage;
        }
    }

    public abstract void refill();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return productionYear == transport.productionYear && maxSpeed == transport.maxSpeed &&
                Double.compare(transport.fuelPercentage, fuelPercentage) == 0 && Objects.equals(brand, transport.brand)
                && Objects.equals(model, transport.model) && Objects.equals(productionCountry, transport.productionCountry)
                && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, productionYear, productionCountry, color, maxSpeed, fuelPercentage);
    }
}
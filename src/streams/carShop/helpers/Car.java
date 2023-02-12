package streams.carShop.helpers;

import java.math.BigDecimal;

public class Car {

    private String brand;
    private String model;
    private CarColor carColor;
    private CarStatus carStatus;
    private BigDecimal price;

    public Car(String brand, String model, CarColor carColor, CarStatus carStatus, BigDecimal price) {
        this.brand = brand;
        this.model = model;
        this.carColor = carColor;
        this.carStatus = carStatus;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carColor=" + carColor +
                ", carStatus=" + carStatus +
                ", price=" + price +
                '}';
    }
}

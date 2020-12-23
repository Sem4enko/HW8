import java.util.UUID;

public class Car {
    private UUID id;
    private Brand brand;
    private Integer year;
    private Integer mileage;
    private Integer price ;

    public Car(UUID id, Brand brand, Integer year, Integer mileage, Integer price) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public Brand getBrand() {
        return brand;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMileage() {
        return mileage;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}

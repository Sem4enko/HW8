import java.util.Random;
import java.util.UUID;

public class GenerateCar {
    public static Car randomCar;
    Random randomValue = new Random();

    private UUID generateId(){
        return UUID.randomUUID();
    }

    private Brand generateBrand(){
      int n = new Random().nextInt(Brand.values().length);
      return Brand.values()[n];
  }

    private int randomYear(){
        return randomValue.nextInt(20)+2000;
    }

    int randomMileage() {
        return randomValue.nextInt(90000);
    }

    int randomPrice() {
        return randomValue.nextInt(44321);
    }

    public  Car randomCar(){
        UUID id = generateId();
        Brand brand = generateBrand();
        int year = randomYear();
        Integer price = randomPrice();
        int mileage = randomMileage();
        return new Car(id, brand, year, mileage, price);
    }
}

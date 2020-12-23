import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        GenerateCar carGenerate = new GenerateCar();
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            cars.add(carGenerate.randomCar());
        }

        System.out.println("\nList of only cars 'AUDI' and 'TESLA':");
        List<Car> l1 = cars.stream()
                .filter(c -> c.getBrand().equals(Brand.TESLA) || c.getBrand().equals(Brand.AUDI))
                .collect(Collectors.toList());
        l1.forEach(System.out::println);

        System.out.println("\nList of cars younger than 2018:");
        List<Car> l2 = cars.stream()
                .filter(c -> c.getYear()<2018)
                .collect(Collectors.toList());
        l2.forEach(System.out::println);


        System.out.println("\nList of cars with mileage less 40000 ");
        List<Car> l3 = cars.stream()
                .filter(c -> c.getMileage()<40000)
                .collect(Collectors.toList());
        l3.forEach(System.out::println);

        System.out.println("\nSorted list of cars in reverse order by price:");
        List<Car> l4 = cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());
        l4.forEach(System.out::println);


       Map<UUID , Car> l5 = l4.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
               .limit(3).collect(Collectors.toMap(Car::getId, c ->c));
        System.out.println("\nThe cars with the lowest prices: ");
        Collection<Car> value = l5.values();
        value.forEach(System.out::println);
    }
}


package e7;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manufacturer manufacturer = new Manufacturer("Volvo", "1918", "Sweden");
        Manufacturer manufacturer1 = new Manufacturer("Audi", "1920", "Germany");

        Car car = new Car("Volkswagen", "automatic", 5000, "2015",
                List.of(manufacturer1), EngineType.S6);
        Car car1 = new Car("Dacia", "Duster", 2000, "2021",
                List.of(manufacturer, manufacturer1), EngineType.S3);

        CarService carService = new CarService();
        carService.addCars(List.of(car, car1));



        System.out.println(carService.getAllCars());


    }
}

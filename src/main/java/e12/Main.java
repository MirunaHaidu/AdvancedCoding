package e12;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manufacturer manufacturer = new Manufacturer("Volvo", "1918", "Sweden");
        Manufacturer manufacturer1 = new Manufacturer("Audi", "1920", "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Ferrari", "1855", "Italy");

        Car car = new Car("Volkswagen", "automatic", 5000, 2015,
                List.of(manufacturer1), EngineType.S6);
        Car car1 = new Car("Dacia", "Duster", 1000, 2021,
                List.of(manufacturer, manufacturer1), EngineType.S3);
        Car car2 = new Car("Skoda", "Octavia", 1500, 1877,
                List.of(manufacturer), EngineType.V12);
        Car car3 = new Car("Audi", "X", 8000, 1940,
                List.of(manufacturer, manufacturer1, manufacturer2), EngineType.V8);
        Car car4 = new Car("BMW", "YY", 12000, 2022,
                List.of(manufacturer2), EngineType.S6);

        CarService carService = new CarService();
        carService.addCars(List.of(car, car1, car2, car3));



        System.out.println(carService.getAllCars());
        System.out.println("---------------------------------------");
        System.out.println(carService.getV12Cars());
        System.out.println("---------------------------------------");
        System.out.println(carService.getManufacturerYearBefore1999());
        System.out.println("---------------------------------------");
        System.out.println(carService.getMostExpensiveCar());
        System.out.println("---------------------------------------");
        System.out.println(carService.getCheapestCar());
        System.out.println("---------------------------------------");
        System.out.println(carService.getCarWithAtLeastThreeManufacturers());
        System.out.println("---------------------------------------");
//        System.out.println(carService.sortAllCars());
        System.out.println("---------------------------------------");
        System.out.println(carService.checkForCar(car4));
        System.out.println("---------------------------------------");
        System.out.println(carService.getCarsByManufacturer(manufacturer1));




    }
}

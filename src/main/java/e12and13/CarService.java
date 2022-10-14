package e12and13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    //1
    public void addCars(List<Car> cars) {
        this.cars.addAll(cars);
    }

    //2
    public void removeCar(Car car) {
        cars.remove(car);
    }

    //3
    public List<Car> getAllCars() {
//        for(Car car:cars){
//            System.out.println(car);
//        }
        return cars;
    }

    //4
    public List<Car> getV12Cars() {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }

    //5
    public List<Car> getManufacturerYearBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    //6
    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparing(Car::getPrice))
                .get();
    }

    //7
    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .get();
    }

    //8
    public List<Car> getCarWithAtLeastThreeManufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)
                .collect(Collectors.toList());
    }


    //9
    public List<Car> sortAllCars(String parameter) {
        if (parameter.equals("ascending")) {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .collect(Collectors.toList());
        } else if (parameter.equals("descending")) {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName).reversed())
                    .collect(Collectors.toList());
        }
//
        return null;
    }

    //10
    public boolean checkForCar(Car myCar) {
        return cars.stream()
                .anyMatch(car -> car.equals(myCar));
    }

    //11
    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    //12 --- nu e bun, trebuia Manufacturer year
//    public List<Car> getCarsByManufacturerSign(String sign, int year) {
//        if (sign.equals("<")) {
//            return cars.stream()
//                    .filter(car -> car.getYearOfManufacture() < year)
//                    .collect(Collectors.toList());
//        } else if (sign.equals(">")) {
//            return cars.stream()
//                    .filter(car -> car.getYearOfManufacture() > year)
//                    .collect(Collectors.toList());
//
//        } else if (sign.equals("<=")) {
//            return cars.stream()
//                    .filter(car -> car.getYearOfManufacture() <= year)
//                    .collect(Collectors.toList());
//        } else if(sign.equals(">=")){
//            return cars.stream()
//                    .filter(car -> car.getYearOfManufacture() >= year)
//                    .collect(Collectors.toList());
//        }else if(sign.equals("=")) {
//            return cars.stream()
//                    .filter(car -> car.getYearOfManufacture() == year)
//                    .collect(Collectors.toList());
//        }else if(sign.equals("!=")) {
//            return cars.stream()
//                    .filter(car -> car.getYearOfManufacture() != year)
//                    .collect(Collectors.toList());
//        }
//        return null;
//    }





    @Override
    public String toString() {
        return "CarService{" +
                "cars=" + cars +
                '}';
    }
}

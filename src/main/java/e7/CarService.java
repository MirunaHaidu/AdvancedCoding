package e7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public void addCars(List<Car> cars){
        this.cars.addAll(cars);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    public List<Car> getAllCars(){
//        for(Car car:cars){
//            System.out.println(car);
//        }
        return cars;
    }

    public List<Car> getV12Cars(){
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }
    public List<Car> getManufacturerYearBefore1999(){
        return cars.stream()
                .filter(car -> car.getYearOfManufacture()<1999)
                .collect(Collectors.toList());
    }






    @Override
    public String toString() {
        return "CarService{" +
                "cars=" + cars +
                '}';
    }
}

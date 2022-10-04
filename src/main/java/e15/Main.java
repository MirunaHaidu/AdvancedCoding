package e15;

public class Main {
    public static void main(String[] args) {

        Car car = Car.FERRARI;
        Car car1 = Car.BMW;
        Car car2 = Car.TOYOTA;

        System.out.println(car.isPremium());
        System.out.println(car2.isPremium());
        System.out.println(car.isFasterThan(car1));



    }
}

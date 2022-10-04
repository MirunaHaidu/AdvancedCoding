package e15;

import java.util.Comparator;

public enum Car {
    FERRARI(25000, 500),
    PORSCHE(20000, 400),
    MERCEDES(15000, 300),
    BMW(18000, 300),
    OPEL(10000, 250),
    FIAT(10000, 170),
    TOYOTA(7000, 150);

    private final int price;
    private final int power;

    Car(int price, int power) {
        this.price = price;
        this.power = power;
    }

    boolean isPremium() {
        return !isRegular();
    }

    boolean isRegular() {
        return price < 20000 && power < 300;
    }

    boolean isFasterThan(Car car) {
        return this.power > car.power;
    }
}

package e17;

public class Main {
    public static void main(String[] args) {
        System.out.println(MeasurementConverter.convert(25, ConversionType.METERS_TO_YARDS));
        System.out.println(MeasurementConverter.convert(45, ConversionType.INCHES_TO_CENTIMETERS));

    }
}

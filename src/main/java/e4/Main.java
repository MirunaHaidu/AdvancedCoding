package e4;

public class Main {
    public static void main(String[] args) {

        ParcelValidator validator = new ParcelValidator();
        Parcel parcel = new Parcel(200,100,50, 25.0f, true);
        Parcel parcel1 = new Parcel(20,30,40,10.0f, false);
        Parcel parcel2 = new Parcel(40, 40, 40, 14.0f, true);
        System.out.println(validator.validate(parcel));
        System.out.println(validator.validate(parcel2));
    }

}

package e7;

public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(4);

        weapon.loadBullet("1");
        weapon.loadBullet("2");
        weapon.loadBullet("3");
//        weapon.loadBullet("4");
//        weapon.loadBullet("5");
//        weapon.loadBullet("6");
//        weapon.loadBullet("7");

        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();

    }
}

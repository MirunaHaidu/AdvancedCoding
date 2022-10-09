package e23;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println(zoo.getNumberOfAnimals());
        zoo.addAnimals("zebra", 2);
        System.out.println(zoo.getNumberOfAnimals());
        zoo.addAnimals("zebra", 2);
        zoo.addAnimals("tiger", 5);
        zoo.addAnimals("turtle", 3);
        System.out.println(zoo.getNumberOfAnimals());

        System.out.println(zoo.getAnimalsCount());
//        System.out.println(zoo.getAnimalsCountSorted());

    }
}

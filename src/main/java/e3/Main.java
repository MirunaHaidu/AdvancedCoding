package e3;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("one", "valueOne");
        storage.addToStorage("two", "valueTwo");
        storage.addToStorage("one", "valueThree");
        storage.addToStorage("two", "valueOne");



        storage.printValues("one");
        storage.findValues("valueOne");
    }
}

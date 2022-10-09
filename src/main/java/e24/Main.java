package e24;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.addToBasket("bread");
        basket.removeFromBasket("bread");

        System.out.println(basket);

    }
}

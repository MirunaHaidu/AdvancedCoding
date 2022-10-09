package e24;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<String> basket;
    Basket(){
        this.basket = new ArrayList<>();
    }

    public void addToBasket(String string){
        basket.add(string);
    }
    public void removeFromBasket(String string){
        basket.remove(string);
    }

    public void empty(){
        if(basket.size()<=0){
            throw new RuntimeException("Basket is empty");
        }
    }

    public void full(){
        if(basket.size()>=10){
            throw new RuntimeException("Basket is full");
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket +
                '}';
    }
}

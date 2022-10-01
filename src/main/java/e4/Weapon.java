package e4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Weapon {
    private int bulletsNumber;
    private Stack<String> magazine;


    public Weapon(int bulletsNumber) {
        this.bulletsNumber = bulletsNumber;
        magazine = new Stack<>();
    }

    public void loadBullet(String bullet) {
        if (magazine.size() < bulletsNumber) {
            magazine.push(bullet);
        }
    }

    public boolean isLoaded(){
        return magazine.size() >0;
    }

    public void shot(){
        if(isLoaded()){
            System.out.println(magazine.pop());
        }else{
            System.out.println("Empty magazine :(");
        }
    }

}

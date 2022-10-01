package e2;

import java.util.HashMap;
import java.util.Map;

//o metoda care primeste un map, in care cheia e String, val e un nr., printeaza fiecare element
//in urmatorul format: Key: X, Value: Y.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Bread", 10);
        myMap.put("Soda", 15);
        myMap.put("Soup", 50);
        myMap.put("Steak", 100);
        myMap.put("Olives", 3);
        myMap.put("Pizza", 80);
        printMap(myMap);




    }
    public static void printMap(Map<String, Integer> map){
       for(Map.Entry<String, Integer> entry : map.entrySet()){
           System.out.printf("Key: %s, Value: %s.\n",
           entry.getKey(), entry.getValue());

       }
    }
}

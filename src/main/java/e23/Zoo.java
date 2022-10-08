package e23;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

public class Zoo {
    List<String> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public Map<String, Integer> getAnimalsCount() {
        Map<String, Integer> animalsBySpecies = new HashMap<>();
        for (String animal : animals) {
            Integer number = animalsBySpecies.get(animal);
            animalsBySpecies.put(animal, (number == null) ? 1 : number + 1);
        }
        return animalsBySpecies;
    }
//    public Map <String, Integer> getAnimalsCountSorted(){
//
//    }



    public void addAnimals(String animal, int number) {
        for (int i = 0; i < number; i++) {
            animals.add(animal);
        }
    }

}

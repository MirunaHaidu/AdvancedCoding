package e3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Storage class pwith Map field, a public constructor and methods:
//addToStorage(String key, Str value)
//printValues(String key)
//findValues(Str value)
//allow to store multiple values under one key
public class Storage {
    private Map<String, List<String>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        if (storage.get(key) == null) {
            storage.put(key, new ArrayList<>());
        }
        storage.get(key).add(value);
    }

    public void printValues(String key) {
        if (storage.get(key) != null) {
            System.out.println(storage.get(key));
        }
    }

    public void findValues(String value) {
//        for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
//            if (entry.getValue().contains(value)) {
//                System.out.println(entry.getKey() + " ");
//            }
//        }
        storage.entrySet().stream()
                .filter(element -> element.getValue().contains(value))
                .forEach(element -> System.out.println(element.getKey()));
    }
}

package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//metodacare primeste o lista de stringuri si returneaza o lista de stringuri sortata alfabetic
public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Stefan");
        words.add("Sorin");
        words.add("Bogdan");
        words.add("Alexandru");
        words.add("Alexandra");
        words.add("Ioana");
        words.add("Maria");
        words.add("george");

        System.out.println(sortWordsAlphabetically(words));

    }

    public static List<String> sortWordsAlphabetically(List<String> words) {
        words.sort(String::compareToIgnoreCase);
        return words;

//        return words.stream()
//                .sorted()
//                .collect(Collectors.toList());

    }
}

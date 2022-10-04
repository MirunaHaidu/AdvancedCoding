package e16;

import java.sql.SQLOutput;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream.of(Runner.values()).forEach(System.out::println);
        System.out.println("------------");
        System.out.println(Runner.getFitnessLevel(350));


    }
}

package e27;

import java.util.List;
import java.util.stream.Collectors;

public class Joiner<T> {
    private String separator;


    public Joiner(String separator) {
        this.separator = separator;
    }



    public String join(T... items) {
        return separator.toString().concat(items.toString());
    }
}

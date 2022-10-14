package advanced.test.Exercise3;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Joiner {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    @SafeVarargs
    public final <T> String join(T... items) {
        String res = Arrays.stream(items)
                .map(i -> i.toString() + separator)
                .collect(Collectors.joining());
        return res.substring(0, res.length() - separator.length());
    }
}

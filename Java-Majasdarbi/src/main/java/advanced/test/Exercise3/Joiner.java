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
        return Arrays.stream(items)
                .map(Object::toString)
                .collect(Collectors.joining(separator));

    }
}

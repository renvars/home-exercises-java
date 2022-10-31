package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "src/main/resources/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String[] scores = fileContent().split(" ");
        List<String> results = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            results.add("");
        }
        for (String score : scores) {
            int value = Integer.parseInt(score) / 10;
            String stars = results.get(value).equals("") ? "" : results.get(value);
            results.set(value, stars += "*");
        }
        printResults(results);


    }

    public static void printResults(List<String> results) {
        for (int i = 0; i < results.size(); i++) {
            if (i == results.size() - 1) {
                System.out.println("  100:" + results.get(i));
            } else {
                System.out.println(i + "0-" + i + "9:" + results.get(i));
            }

        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(file);
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}

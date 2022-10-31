package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "src/main/resources/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(file);
        List<String> text = Files.readAllLines(path, charset);

        int lines = text.size();
        int words = 0;
        for (String line : text) {
            words += line.split(" ").length;
        }
        int chars = 0;
        for (String line : text) {
            String[] test = line.split(" ");
            for (String word : test) {
                chars += word.length();
            }
        }
        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
        System.out.println("Chars = " + chars);

    }
}

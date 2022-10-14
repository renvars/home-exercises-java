package advanced.test.Exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReaderAndSaver {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/java/advanced/test/Exercise4/someText.txt";
        String reversedString = getString(filePath);
        writeFile(reversedString);
    }

    public static void writeFile(String str) {
        try {
            FileWriter fileWriter = new FileWriter("src/main/java/advanced/test/Exercise4/newText.txt");
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            e.getStackTrace();
        }


    }

    public static String getString(String file) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader buffer = new BufferedReader(
                new FileReader(file))) {
            String str;
            while ((str = buffer.readLine()) != null) {
                str = reverseString(str);
                stringBuilder.append(str).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static String reverseString(String str) {
        String res = "";
        String[] strSplit = str.split("");
        for (int i = strSplit.length - 1; i >= 0; i--) {
            res += strSplit[i];
        }
        return res;
    }
}

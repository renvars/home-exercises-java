package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "src/main/resources/flights.txt";
    public static Map<String, List<String>> allDestinations = new HashMap<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner in = new Scanner(System.in);
        final Path path = Paths.get(file);
        List<String> flights = Files.readAllLines(path, charset);
        allDestinations = getAllDestinations(flights);


        fly(in);


    }

    public static void fly(Scanner in) {
        List<String> visitedDestinations = new ArrayList<>();
        System.out.println("Welcome to the Codelex-Java Airline!");
        System.out.println("To display all the cities press '1',to quit press '#' : ");
        String choice = in.nextLine();
        if (choice.equals("#")) {
            System.out.println("Thanks for flying with us!");
        } else if (choice.equals("1")) {
            listAvailableFlights("start");
            System.out.print("What is your choice: ");
            int destination = in.nextInt();
            String firstDest = firstFlight(destination);
            visitedDestinations.add(firstDest);
            while (!firstDest.equals(visitedDestinations.get(visitedDestinations.size() - 1)) || visitedDestinations.size() < 2) {
                listAvailableFlights(visitedDestinations.get(visitedDestinations.size() - 1));
                System.out.println("What is your choice: ");
                destination = in.nextInt();
                String key = visitedDestinations.get(visitedDestinations.size() - 1);
                String dest = allDestinations.get(key).get(destination);
                visitedDestinations.add(dest);

            }
            System.out.println("Well then that was one hell of a trip!");
            visitedPrint(visitedDestinations);

        }
    }

    public static void visitedPrint(List<String> visit) {
        System.out.print("Visited: \n");
        for (String s : visit) {
            System.out.print("\t" + s + "\n");
        }
    }


    public static String otherFlight(int index) {
        int count = 0;
        String res = "";
        for (String entry : allDestinations.keySet()) {
            if (count == index) {
                res = entry;
            }
            count++;
        }
        return res;

    }

    public static String firstFlight(int index) {
        int count = 0;
        String res = "";
        for (String entry : allDestinations.keySet()) {
            if (count == index) {
                res = entry;
            }
            count++;
        }
        return res;

    }

    public static void listAvailableFlights(String key) {
        System.out.println("Available destinations:");
        int count = 0;
        if (key.equals("start")) {
            for (Map.Entry<String, List<String>> entry : allDestinations.entrySet()) {
                System.out.println("\t" + entry.getKey() + ": " + count);
                count++;
            }
        } else {
            List<String> currentDest = allDestinations.get(key);
            for (String dest : currentDest) {
                System.out.println("\t" + dest + ": " + count);
                count++;
            }
        }
    }

    public static Map<String, List<String>> getAllDestinations(List<String> flights) {
        Map<String, List<String>> allDestinations = new HashMap<>();
        for (String route : flights) {
            String[] newRoute = route.split("->");
            for (int i = 0; i < newRoute.length; i++) {
                newRoute[i] = newRoute[i].trim();
            }
            if (allDestinations.containsKey(newRoute[0])) {
                allDestinations.get(newRoute[0]).add(newRoute[1]);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(newRoute[1]);
                allDestinations.put(newRoute[0], tempList);
            }
        }
        return allDestinations;
    }

}

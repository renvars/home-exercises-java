package io.codelex.streams.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map((number) -> (int) Math.sqrt(number)).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).filter(age -> age >= 18).distinct().toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return (int) users.stream().map(User::getAge).filter(age -> age > 25).count();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().reduce(0, Integer::sum);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).toList();
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(name -> name.split(" ")[0]).toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return Arrays.stream(String.join("", names).split("")).map(ch -> String.join(",", ch)).distinct().toList();
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(User::getName).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        double age = users.stream().map(User::getAge).reduce(0, Integer::sum);
        double count = users.size();
        return age / count;
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().map(User::getAge).max(Integer::compare).get();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().map(User::getAge).min(Integer::compare).get();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        Map<Boolean, List<User>> res = new HashMap<>();
        res.put(true, users.stream().filter(User::isMale).toList());
        res.put(false, users.stream().filter(user -> !user.isMale()).toList());
        return res;
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(Collectors.toMap(User::getAge, user -> users.stream().filter(user1 -> user.getAge() == user1.getAge()).toList()));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        Map<Boolean, Map<Integer, List<User>>> res = new HashMap<>();
        res.put(true, users.stream().filter(User::isMale).collect(Collectors.toMap(User::getAge, user -> users.stream().filter(user1 -> user.getAge() == user1.getAge()).toList())));
        res.put(false, users.stream().filter(user -> !user.isMale()).collect(Collectors.toMap(User::getAge, user -> users.stream().filter(user1 -> user.getAge() == user1.getAge()).toList())));
        return res;
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        Map<Boolean, Long> res = new HashMap<>();
        res.put(true, users.stream().filter(User::isMale).count());
        res.put(false, users.stream().filter(user -> !user.isMale()).count());
        return res;
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().anyMatch(user -> user.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().noneMatch(user -> user.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).toList();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.iterate(2, i -> i + 1).filter(StreamsExercise::isPrime).limit(10).boxed().toList();

    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        Random random = new Random();
        return random.ints(10).boxed().toList();
    }

    public static User findOldest(List<User> users) {

        //gets the biggest number just by comparing them one by one
        return users.stream().reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2).get();
    }

    public static int sumAge(List<User> users) {
        return users.stream().map(User::getAge).reduce(0, Integer::sum);
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        long count = users.size();
        int min = getMinAge(users);
        int max = getMaxAge(users);
        long sum = sum(users.stream().map(User::getAge).toList());
        return new IntSummaryStatistics(count, min, max, sum);
    }
}
